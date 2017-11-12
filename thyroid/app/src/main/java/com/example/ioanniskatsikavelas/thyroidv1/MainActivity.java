package com.example.ioanniskatsikavelas.thyroidv1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    ImageButton imgBtnadd,imgBtnwiki,imgBtreminder,imgBtpatienceInfo, imgBtcopyright;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    public void addListenerOnButton() {


        imgBtnadd = (ImageButton) findViewById(R.id.imageadd);
        imgBtnwiki = (ImageButton) findViewById(R.id.imageinfo);
        imgBtreminder = (ImageButton) findViewById(R.id.imagereminder);

        imgBtpatienceInfo = (ImageButton) findViewById(R.id.patienceInfo);
        imgBtcopyright = (ImageButton) findViewById(R.id.outside_imageview);

        imgBtnadd.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {Intent intent = new Intent(MainActivity.this, register.class);
                                          startActivity(intent);

                                      }
                                  }
        );

        imgBtnwiki.setOnClickListener(new View.OnClickListener(){
                                        @Override
                                        public void onClick(View v){Intent intent = new Intent(MainActivity.this, Wikimethod.class);
                                        startActivity(intent);
                                        }
        }
        );

        imgBtreminder.setOnClickListener(new View.OnClickListener(){
                                          @Override
                                          public void onClick(View v){Intent intent = new Intent(MainActivity.this, Remindermethod.class);
                                              startActivity(intent);
                                          }
                                      }
        );

        imgBtpatienceInfo.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {Intent intent = new Intent(MainActivity.this, patiencelogin.class);
                                             startActivity(intent);

                                         }
                                     }
        );
        imgBtcopyright.setOnClickListener(new View.OnClickListener() {
                                                 @Override
                                                 public void onClick(View v) {Intent intent = new Intent(MainActivity.this, copyright.class);
                                                     startActivity(intent);

                                                 }
                                             }
        );

    }
}



