package com.example.bridgeit.webviewtest;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    ImageView imageView;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView=(WebView)findViewById(R.id.web);
        editText=(EditText)findViewById(R.id.edit);
        imageView=(ImageView)findViewById(R.id.srch);
        imageView=(ImageView)findViewById(R.id.fb);
        imageView=(ImageView)findViewById(R.id.lnkd);
        imageView=(ImageView)findViewById(R.id.twtr);
        imageView=(ImageView)findViewById(R.id.youtube);
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                Toast.makeText(getApplicationContext(),"Page loading started",Toast.LENGTH_SHORT).show();
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                Toast.makeText(getApplicationContext(),"Page loading finished",Toast.LENGTH_SHORT).show();
            }
        });
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
    }
    public void test(View view){
        switch(view.getId()){
            case R.id.fb:
                webView.loadUrl("http://www.facebook.com");
                break;
            case R.id.lnkd:
                webView.loadUrl("http://www.linkedin.com");
                break;
            case R.id.twtr:
                webView.loadUrl("http://www.twitter.com");
                break;
            case R.id.youtube:
                webView.loadUrl("http://www.youtube.com");
                break;
            case R.id.srch:
                webView.loadUrl("http://" + editText.getText().toString());
                break;

        }
    }
}
