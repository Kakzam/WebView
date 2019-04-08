package com.pondokit.developer.study_in_web_view;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MainActivity extends Activity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setView();

        webView.setWebChromeClient(new WebChromeClient());
        webView.loadUrl("http://bit.ly/LaporanKeagamaanPondokIT");

    }

    private void setView() {

        webView = findViewById(R.id.webview);

    }
}
