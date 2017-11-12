package com.example.ioanniskatsikavelas.thyroidv1;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class register extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextName;
    private EditText editTextSurname;
    private EditText editTextUsername;
    private EditText editTextPassword;
    private EditText editTextEmail;

    private EditText editTextAMI;
    private EditText editTextAMTH;
    private EditText editTextTelephone;
    private EditText editTextHouse;

    private EditText editTextSex;
    private EditText editTextDateOfBirth;
    private EditText editTextDiagnosisDate;
    private EditText editTextSurgeryDate;

    private EditText editTextSurgeon;
    private EditText editTextHistological;
    private EditText editTextMaxDiameter;
    private EditText editTextArithmosEstiwn;

    private EditText editTextLovoi;
    private EditText editTextDiithisi;
    private EditText editTextArithmosEkserethentwnLns;
    private EditText editTextArithmosDiithimenwnLns;

    private EditText editTextStage;
    private EditText editTextHmeromhniaMetenxeirisis;
    private EditText editTextProetoimasia;
    private EditText editTextScan;


    private EditText editTextUptake;
    private EditText editTextTSH;
    private EditText editTextHTG;
    private EditText editTextTG;

    private EditText editTextTm;
    private EditText editTextUs;
    private EditText editTextAblationDate;


    private Button buttonRegister;

    private static final String REGISTER_URL = "http://mdoc.16mb.com/UserRegistration/register.php";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextSurname = (EditText) findViewById(R.id.editTextSurname);
        editTextUsername = (EditText) findViewById(R.id.editTextUsername);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);


        editTextAMI = (EditText) findViewById(R.id.editTextAMI);
        editTextAMTH = (EditText) findViewById(R.id.editTextAMTH);
        editTextTelephone = (EditText) findViewById(R.id.editTextTelephone);
        editTextHouse = (EditText) findViewById(R.id.editTextHouse);

        editTextSex = (EditText) findViewById(R.id.editTextSex);
        editTextDateOfBirth = (EditText) findViewById(R.id.editTextDateOfBirth);
        editTextDiagnosisDate = (EditText) findViewById(R.id.editTextDiagnosisDate);
        editTextSurgeryDate = (EditText) findViewById(R.id.editTextSurgeryDate);

        editTextSurgeon = (EditText) findViewById(R.id.editTextSurgeon);
        editTextHistological = (EditText) findViewById(R.id.editTextHistological);
        editTextMaxDiameter = (EditText) findViewById(R.id.editTextMaxDiameter);
        editTextArithmosEstiwn = (EditText) findViewById(R.id.editTextArithmosEstiwn);

        editTextLovoi = (EditText) findViewById(R.id.editTextLovoi);
        editTextDiithisi = (EditText) findViewById(R.id.editTextDiithisi);
        editTextArithmosEkserethentwnLns = (EditText) findViewById(R.id.editTextArithmosEkserethentwnLns);
        editTextArithmosDiithimenwnLns = (EditText) findViewById(R.id.editTextAirthmosDiithimenwnLns);

        editTextStage = (EditText) findViewById(R.id.editTextStage);
        editTextHmeromhniaMetenxeirisis = (EditText) findViewById(R.id.editTextHmeromhniaMetenxeirisis);
        editTextProetoimasia = (EditText) findViewById(R.id.editTextProetoimasia);
        editTextScan = (EditText) findViewById(R.id.editTextScan);


        editTextUptake = (EditText) findViewById(R.id.editTextUptake);
        editTextTSH = (EditText) findViewById(R.id.editTextTSH);
        editTextHTG = (EditText) findViewById(R.id.editTextHTG);
        editTextTG = (EditText) findViewById(R.id.editTextTG);

        editTextTm = (EditText) findViewById(R.id.editTextTm);
        editTextUs = (EditText) findViewById(R.id.editTextUs);
        editTextAblationDate = (EditText) findViewById(R.id.editTextAblationDate);


        buttonRegister = (Button) findViewById(R.id.buttonRegister);

        buttonRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == buttonRegister) {
            registerUser();
        }
    }

    private void registerUser() {

        String name = editTextName.getText().toString().trim().toLowerCase();
        String surname = editTextSurname.getText().toString().trim().toLowerCase();
        String username = editTextUsername.getText().toString().trim().toLowerCase();
        String password = editTextPassword.getText().toString().trim().toLowerCase();

        String email = editTextEmail.getText().toString().trim().toLowerCase();
        String ami = editTextAMI.getText().toString().trim().toLowerCase();
        String amth = editTextAMTH.getText().toString().trim().toLowerCase();
        String telephone = editTextTelephone.getText().toString().trim().toLowerCase();

        String house = editTextHouse.getText().toString().trim().toLowerCase();
        String sex = editTextSex.getText().toString().trim().toLowerCase();
        String birth = editTextDateOfBirth.getText().toString().trim().toLowerCase();
        String diagnosis = editTextDiagnosisDate.getText().toString().trim().toLowerCase();

        String surgery = editTextSurgeryDate.getText().toString().trim().toLowerCase();
        String surgeon = editTextSurgeon.getText().toString().trim().toLowerCase();
        String histological = editTextHistological.getText().toString().trim().toLowerCase();
        String diameter = editTextMaxDiameter.getText().toString().trim().toLowerCase();

        String estiwn = editTextArithmosEstiwn.getText().toString().trim().toLowerCase();
        String lovoi = editTextLovoi.getText().toString().trim().toLowerCase();
        String diithisi = editTextDiithisi.getText().toString().trim().toLowerCase();
        String ekserethentwnlns = editTextArithmosEkserethentwnLns.getText().toString().trim().toLowerCase();

        String diithimenwnlns = editTextArithmosDiithimenwnLns.getText().toString().trim().toLowerCase();
        String stage = editTextStage.getText().toString().trim().toLowerCase();
        String hmerametenxeirisis = editTextHmeromhniaMetenxeirisis.getText().toString().trim().toLowerCase();
        String proetoimasia = editTextProetoimasia.getText().toString().trim().toLowerCase();

        String scan = editTextScan.getText().toString().trim().toLowerCase();
        String uptake = editTextUptake.getText().toString().trim().toLowerCase();
        String tsh = editTextTSH.getText().toString().trim().toLowerCase();
        String htg = editTextHTG.getText().toString().trim().toLowerCase();

        String tg = editTextTG.getText().toString().trim().toLowerCase();
        String tm = editTextTm.getText().toString().trim().toLowerCase();
        String us = editTextUs.getText().toString().trim().toLowerCase();
        String ablation = editTextAblationDate.getText().toString().trim().toLowerCase();

        register(name, username, password, email, surname, ami, amth, telephone, house, sex, birth, diagnosis, surgery,
                surgeon, histological, diameter, estiwn, lovoi, diithisi, ekserethentwnlns, diithimenwnlns,
                stage, hmerametenxeirisis, proetoimasia, scan, uptake, tsh, htg, tg, tm, us, ablation);
    }

    private void register(String name, String username, String password, String email, String surname, String ami, String amth, String telephone,
                          String house, String sex, String birth, String diagnosis, String surgery, String surgeon, String histological, String diameter,
                          String estiwn, String lovoi, String diithisi, String ekserethentwnlns, String diithimenwnlns, String stage, String hmerametenxeirisis,
                          String proetoimasia, String scan, String uptake, String tsh, String htg, String tg, String tm, String us, String ablation) {
        String urlSuffix = "?name=" + name + "&username=" + username + "&password=" + password + "&email=" + email + "&surname=" + surname + "&ami=" + ami + "&amth=" + amth +
                "&telephone=" + telephone + "&house=" + house + "&sex=" + sex + "&birth=" + birth + "&diagnosis=" + diagnosis + "&surgery=" + surgery + "&surgeon=" + surgeon +
                "&histological=" + histological + "&diameter=" + diameter + "&estiwn=" + estiwn + "&lovoi=" + lovoi + "&diithisi=" + diithisi + "&ekserethentwnlns=" + ekserethentwnlns + "&diithimenwnlns=" + diithimenwnlns + "&stage=" + stage + "&hmerametenxeirisis=" + hmerametenxeirisis + "&proetoimasia=" + proetoimasia + "&scan=" + scan +
                "&uptake=" + uptake + "&tsh=" + tsh + "&htg=" + htg + "&tg=" + tg + "&tm=" + tm + "&us=" + us + "&ablation=" + ablation;


        class RegisterUser extends AsyncTask<String, Void, String> {

            ProgressDialog loading;


            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(register.this, "Please Wait", null, true, true);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(String... params) {
                String s = params[0];
                BufferedReader bufferedReader = null;
                try {
                    URL url = new URL(REGISTER_URL + s);
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()));

                    String result;

                    result = bufferedReader.readLine();

                    return result;
                } catch (Exception e) {
                    return null;
                }
            }
        }

        RegisterUser ru = new RegisterUser();
        ru.execute(urlSuffix);
    }
}