package com.example.ioanniskatsikavelas.thyroidv1;

import android.os.Bundle;
import android.app.Activity;
import android.widget.EditText;
import android.widget.TextView;

public class patientinfo extends Activity {

    private TextView nameLabel;
    private TextView surnameLabel;
    private TextView AMILabel;
    private TextView AMTHLabel;
    private TextView diagnosisDateLabel;
    private TextView surgeryDate;
    private TextView histologicalLabel;
    private TextView maxDiameterLabel;
    private TextView arithmosEstiwnLabel;
    private TextView lovoiLabel;
    private TextView diithisiLabel;
    private TextView arithmosEkserethentwnLnsLabel;
    private TextView airthmosDiithimenwnLnsLabel;
    private TextView stageLabel;
    private TextView proetoimasiaLabel;
    private TextView hmeromhniaMetenxeirisisLabel;
    private TextView scanLabel;
    private TextView uptakeLabel;
    private TextView TSHLabel;
    private TextView HTGLabel;
    private TextView TGLabel;
    private TextView TmLabel;
    private TextView UsLabel;
    private TextView AblationDateLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientinfo);

        nameLabel = (TextView) findViewById(R.id.Name);
        surnameLabel = (TextView) findViewById(R.id.Surname);
        AMILabel = (TextView) findViewById(R.id.AMI);
        AMTHLabel = (TextView) findViewById(R.id.AMTH);
        diagnosisDateLabel = (TextView) findViewById(R.id.DiagnosisDate);
        surgeryDate = (TextView) findViewById(R.id.SurgeryDate) ;

        histologicalLabel = (TextView) findViewById(R.id.Histological) ;
        maxDiameterLabel = (TextView) findViewById(R.id.MaxDiameter) ;
        arithmosEstiwnLabel = (TextView) findViewById(R.id.ArithmosEstiwn) ;
        lovoiLabel = (TextView) findViewById(R.id.Lovoi) ;
        diithisiLabel = (TextView) findViewById(R.id.Diithisi) ;

        arithmosEkserethentwnLnsLabel = (TextView) findViewById(R.id.ArithmosEkserethentwnLns) ;
        airthmosDiithimenwnLnsLabel = (TextView) findViewById(R.id.AirthmosDiithimenwnLns) ;
        stageLabel = (TextView) findViewById(R.id.Stage) ;
        proetoimasiaLabel = (TextView) findViewById(R.id.Proetoimasia) ;
        hmeromhniaMetenxeirisisLabel = (TextView) findViewById(R.id.HmeromhniaMetenxeirisis) ;

        scanLabel = (TextView) findViewById(R.id.Scan) ;
        uptakeLabel = (TextView) findViewById(R.id.Uptake) ;
        TSHLabel = (TextView) findViewById(R.id.TSH) ;
        HTGLabel = (TextView) findViewById(R.id.HTG) ;
        TGLabel = (TextView) findViewById(R.id.TG) ;

        TmLabel = (TextView) findViewById(R.id.Tm) ;
        UsLabel = (TextView) findViewById(R.id.Us) ;
        AblationDateLabel = (TextView) findViewById(R.id.AblationDate) ;



        nameLabel.setText(patiencelogin.getProperty("name"));
        surnameLabel.setText(patiencelogin.getProperty("surname"));
        AMILabel.setText(patiencelogin.getProperty("ami"));
        AMTHLabel.setText(patiencelogin.getProperty("amth"));
        diagnosisDateLabel.setText(patiencelogin.getProperty("diagnosis"));

        surgeryDate.setText(patiencelogin.getProperty("surgery"));
        histologicalLabel.setText(patiencelogin.getProperty("histological"));
        maxDiameterLabel.setText(patiencelogin.getProperty("diameter"));
        arithmosEstiwnLabel.setText(patiencelogin.getProperty("estiwn"));
        lovoiLabel.setText(patiencelogin.getProperty("lovoi"));

        diithisiLabel.setText(patiencelogin.getProperty("diithisi"));
        arithmosEkserethentwnLnsLabel.setText(patiencelogin.getProperty("ekserethentwnlns"));
        airthmosDiithimenwnLnsLabel.setText(patiencelogin.getProperty("diithimenwnlns"));
        stageLabel.setText(patiencelogin.getProperty("stage"));
        proetoimasiaLabel.setText(patiencelogin.getProperty("proetoimasia"));

        hmeromhniaMetenxeirisisLabel.setText(patiencelogin.getProperty("hmerametenxeirisis"));
        scanLabel.setText(patiencelogin.getProperty("scan"));
        uptakeLabel.setText(patiencelogin.getProperty("uptake"));
        TSHLabel.setText(patiencelogin.getProperty("tsh"));
        HTGLabel.setText(patiencelogin.getProperty("htg"));

        TGLabel.setText(patiencelogin.getProperty("tg"));
        TmLabel.setText(patiencelogin.getProperty("tm"));
        UsLabel.setText(patiencelogin.getProperty("us"));
        AblationDateLabel.setText(patiencelogin.getProperty("ablation"));

    }

}
