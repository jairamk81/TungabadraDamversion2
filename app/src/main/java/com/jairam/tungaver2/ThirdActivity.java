package com.jairam.tungaver2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by jai on 9/8/17.
 */

public class ThirdActivity extends AppCompatActivity{
    WebView myweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        setpast();
    }

    public void setpast(){

        myweb = (WebView) findViewById(R.id.myViewId2);
        WebSettings mysettings= myweb.getSettings();
        mysettings.setJavaScriptEnabled(true);
        myweb.loadUrl("http://tungabhadraboard.in/tbbrsms/reservoir_info_search.php");
        myweb.setWebViewClient(new WebViewClient());
    }
}
