package com.cyt.androidclient.activity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.cyt.androidclient.R;

public class NbaDetailActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nbadetail_layout);
        initView();
        Bundle bundle = this.getIntent().getExtras();
        String name = bundle.getString("url");
        webView.setWebViewClient(new WebViewClient());
        WebSettings wbs =webView.getSettings();
        wbs.setUseWideViewPort(true);
        wbs.setJavaScriptEnabled(true);
        wbs.setSupportZoom(true);
        webView.loadUrl(name);
    }

    private void initView() {
        webView = findViewById(R.id.web_view);
    }
}
