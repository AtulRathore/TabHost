package com.example.atul.tabhost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity{

    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        //Tab1
        TabHost.TabSpec tt = tabHost.newTabSpec("");
        tt.setIndicator("Calander");
        tt.setContent(R.id.tab1);
        tabHost.addTab(tt);

        //Tab2

        tt = tabHost.newTabSpec("");
        tt.setIndicator("Image View");
        tt.setContent(R.id.tab2);
        tabHost.addTab(tt);

        //Tab3

        tt =tabHost.newTabSpec("");
        tt.setIndicator("Clock");
        tt.setContent(R.id.tab3);
        tabHost.addTab(tt);

    }
}
