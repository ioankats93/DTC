package com.example.ioanniskatsikavelas.thyroidv1;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class copyright extends AppCompatActivity {

    private Button legaltermsbt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_copyright);
        addListenerOnButton();
    }


    public void addListenerOnButton() {


        legaltermsbt = (Button) findViewById(R.id.legalTermsbt);

        legaltermsbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(copyright.this, LegalTerms.class);
                //once the button is clicked, disable it to avoid multiple login requests
                //it is enabled once the login response is received
                startActivity(intent);


            }
        });

    }
}
