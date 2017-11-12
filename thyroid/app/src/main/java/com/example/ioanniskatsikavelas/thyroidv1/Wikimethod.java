package com.example.ioanniskatsikavelas.thyroidv1;

import android.app.ExpandableListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Wikimethod extends AppCompatActivity {

    ExpandableListView expandableListView;
    //
    private WebView myBrowser;
    private int homeOrWiki = 0 ;
    boolean wikimethod = true ;
    boolean homePageGetsTrue = false ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wikimethod);
        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);


        expandableListView = (ExpandableListView) findViewById(R.id.exp_listview);
        List<String> Headings = new ArrayList<String>();
        List<String> L1 = new ArrayList<String>();
        List<String> L2 = new ArrayList<String>();
        List<String> L3 = new ArrayList<String>();

        List<String> L4 = new ArrayList<String>();
        List<String> L5 = new ArrayList<String>();
        List<String> L6 = new ArrayList<String>();
        List<String> L7 = new ArrayList<String>();

        List<String> L8 = new ArrayList<String>();
        List<String> L9 = new ArrayList<String>();

        HashMap<String, List<String>> ChildList = new HashMap<String, List<String>>();
        String heading_items[] = getResources().getStringArray(R.array.header_titles);
        String l1[] = getResources().getStringArray(R.array.h1_titles);
        String l2[] = getResources().getStringArray(R.array.h2_titles);
        String l3[] = getResources().getStringArray(R.array.h3_titles);

        String l4[] = getResources().getStringArray(R.array.h4_titles);
        String l5[] = getResources().getStringArray(R.array.h5_titles);
        String l6[] = getResources().getStringArray(R.array.h6_titles);
        String l7[] = getResources().getStringArray(R.array.h7_titles);

        String l8[] = getResources().getStringArray(R.array.h8_titles);
        String l9[] = getResources().getStringArray(R.array.h9_titles);

        for (String title : heading_items) {
            Headings.add(title);
        }
        for (String title : l1) {
            L1.add(title);
        }
        for (String title : l2) {
            L2.add(title);
        }
        for (String title : l3) {
            L3.add(title);
        }
        for (String title : l4) {
            L4.add(title);
        }
        for (String title : l5) {
            L5.add(title);
        }
        for (String title : l6) {
            L6.add(title);
        }
        for (String title : l7) {
            L7.add(title);
        }
        for (String title : l8) {
            L8.add(title);
        }
        for (String title : l9) {
            L9.add(title);
        }

        ChildList.put(Headings.get(0), L1);
        ChildList.put(Headings.get(1), L2);
        ChildList.put(Headings.get(2), L3);
        ChildList.put(Headings.get(3), L4);
        ChildList.put(Headings.get(4), L5);
        ChildList.put(Headings.get(5), L6);
        ChildList.put(Headings.get(6), L7);
        ChildList.put(Headings.get(7), L8);
        ChildList.put(Headings.get(8), L9);

        Myadapter myadapter = new Myadapter(this, Headings, ChildList);
        expandableListView.setAdapter(myadapter);


        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                //list 1.x
                if (groupPosition == 0) {
                    if (childPosition == 0) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html1c1.html");

                    }
                    if (childPosition == 1) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html1c2.html");
                    }
                }
                //list 2.x
                if (groupPosition == 1) {
                    if (childPosition == 0) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html2c1.html");
                    }
                    if (childPosition == 1) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html2c2.html");
                    }
                }

                if (groupPosition == 2) {
                    if (childPosition == 0) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html3c1.html");
                    }
                    if (childPosition == 1) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html3c2.html");
                    }
                    if (childPosition == 2) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html3c3.html");
                    }
                    if (childPosition == 3) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html3c4.html");
                    }
                    if (childPosition == 4) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html3c5.html");
                    }
                    if (childPosition == 5) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html3c6.html");
                    }
                    if (childPosition == 6) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html3c7.html");
                    }
                    if (childPosition == 7) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html3c8.html");
                    }
                }

                if (groupPosition == 3) {
                    if (childPosition == 0) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html4c1.html");
                    }
                    if (childPosition == 1) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html4c2.html");
                    }
                    if (childPosition == 2) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html4c3.html");
                    }
                }
                if (groupPosition == 4) {
                    if (childPosition == 0) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html5c1.html");
                    }
                    if (childPosition == 1) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html5c2.html");
                    }
                    if (childPosition == 2) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html5c3.html");
                    }
                }
                if (groupPosition == 5) {
                    if (childPosition == 0) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html6c1.html");
                    }
                    if (childPosition == 1) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html6c2.html");
                    }
                    if (childPosition == 2) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html6c3.html");
                    }
                    if (childPosition == 3) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html6c4.html");
                    }
                    if (childPosition == 4) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html6c5.html");
                    }
                    if (childPosition == 5) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html6c6.html");
                    }
                    if (childPosition == 6) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html6c7.html");
                    }
                    if (childPosition == 7) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html6c8.html");
                    }
                    if (childPosition == 8) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html6c9.html");
                    }
                    if (childPosition == 9) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html6c10.html");
                    }
                }
                if (groupPosition == 6) {
                    if (childPosition == 0) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html7c1.html");
                    }
                    if (childPosition == 1) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html7c2.html");
                    }
                }
                if (groupPosition == 7) {
                    if (childPosition == 0) {
                        setContentView(R.layout.activity_view1b1);
                        myBrowser = (WebView) findViewById(R.id.mybrowser1c1);
                        myBrowser.loadUrl("file:///android_asset/html8c1.html");
                    }
                }


                return false;
            }
        });
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();

        if(myBrowser != null){
            Intent intent = new Intent(Wikimethod.this, Wikimethod.class);
            startActivity(intent);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

