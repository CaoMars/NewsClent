package com.cyt.androidclient.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.cyt.androidclient.R;

public class CarDetailActivity extends AppCompatActivity {
    private WebView webView;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardetail_layout);
        initView();
        Bundle bundle = this.getIntent().getExtras();
        String name = bundle.getString("car_url");
        webView.setWebViewClient(new WebViewClient());
        WebSettings wbs = webView.getSettings();
        wbs.setJavaScriptEnabled(true);
        //支持缩放
        wbs.setSupportZoom(true);
        webView.getSettings().setUseWideViewPort(true);
        wbs.setLoadWithOverviewMode(true);
        wbs.setBuiltInZoomControls(true);
        webView.loadUrl(name);
    }

    private void initView() {
        webView = findViewById(R.id.web_view);
    }
}
