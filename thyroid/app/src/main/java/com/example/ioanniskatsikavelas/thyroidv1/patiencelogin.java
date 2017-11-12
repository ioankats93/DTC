package com.example.ioanniskatsikavelas.thyroidv1;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.github.kittinunf.fuel.Fuel;
import com.github.kittinunf.fuel.core.FuelError;
import com.github.kittinunf.fuel.core.Handler;
import com.github.kittinunf.fuel.core.Request;
import com.github.kittinunf.fuel.core.Response;
import com.github.kittinunf.result.Result;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class patiencelogin extends Activity {


    public static JSONObject loggedInData;
    private static String TAG = "PatienceLogin";
    private Button loginButton;
    private TextView usernameTextView;
    private TextView passwordTextView;
    private String username;
    private String password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patiencelogin);


        usernameTextView = (TextView)findViewById(R.id.username);
        passwordTextView = (TextView)findViewById(R.id.password);

        loginButton = (Button)findViewById(R.id.buttonRegister);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //once the button is clicked, disable it to avoid multiple login requests
                //it is enabled once the login response is received
                loginButton.setEnabled(false);
                username = usernameTextView.getText().toString();
                password = passwordTextView.getText().toString();
                login();
            }
        });


    }


    public void login() {

        Fuel.get("http://mdoc.16mb.com/login.php?username=" + username + "&password="+ password).responseString(new Handler<String>() {
            @Override
            public void failure(Request request, Response response, FuelError error) {
                Toast.makeText(patiencelogin.this, "Error logging in", Toast.LENGTH_SHORT).show();
                loginButton.setEnabled(true);
            }

            @Override
            public void success(Request request, Response response, String data) {
                JSONObject j;
                try {
                    j = new JSONObject(data);
                    loggedInData = j;
                    Toast.makeText(patiencelogin.this, "Successfully logged in", Toast.LENGTH_SHORT).show();


                    // Start next intent?

                    {
                        Intent intent = new Intent(patiencelogin.this, patientinfo.class);
                        startActivity(intent);

                    }



                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(patiencelogin.this, "Error logging in", Toast.LENGTH_SHORT).show();
                }
                loginButton.setEnabled(true);


            }
        });
    }


    public static String getProperty(String property){

        if(loggedInData == null){
            Log.e(TAG, "No login data yet");
            return "";
        }
        try {
            return loggedInData.getString(property);
        } catch (JSONException e) {
            e.printStackTrace();
            Log.e(TAG, "No such property in loggedInData: '"+property+"'");
            return "";

        }
    }

}