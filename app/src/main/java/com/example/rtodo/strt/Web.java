package com.example.rtodo.strt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        Bundle bundle = getIntent().getExtras();
        String input = bundle.getString("URL");

        WebView webView = findViewById(R.id.webID);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(input);
    }
}
