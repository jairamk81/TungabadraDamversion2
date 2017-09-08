package com.jairam.tungaver2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class SecondActivity extends AppCompatActivity {

    WebView myweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setpage();
    }

    public void setpage(){

        myweb = (WebView) findViewById(R.id.myViewId);
        WebSettings mysettings= myweb.getSettings();
        mysettings.setJavaScriptEnabled(true);
        myweb.loadUrl("http://tungabhadraboard.in/tbbrsms/reservoir_info_report.php");
        myweb.setWebViewClient(new WebViewClient());
    }
}

