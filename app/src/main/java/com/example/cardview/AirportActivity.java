package com.example.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AirportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airport);


        webView = (WebView) findViewById(R.id.webViewId);
        WebSettings webSettings =webView.getSettings(); //for enabling the JavaScrift
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.cheapflights.ca/horizon/sem/flights/general?lang=en&skipapp=true&gclid=EAIaIQobChMI2orP-L6o4wIVUSQrCh0zzg0BEAAYASAAEgI2yPD_BwE&aid=61534278441");
    } private WebView webView;

    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }
        else{
            super.onBackPressed();
        }

    }
}
