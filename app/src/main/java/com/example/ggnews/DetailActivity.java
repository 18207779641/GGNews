package com.example.ggnews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ListView;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class DetailActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String newsDetailUrl = intent.getStringExtra(Constants.NEWS_DETAIL_URL_KEY);
        Log.d("44", newsDetailUrl);
        webView = findViewById(R.id.web_view);

        // Enable JavaScript for the WebView
        webView.getSettings().setJavaScriptEnabled(true);

        // Set a WebViewClient to handle page loading and error events
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                // Extract the news content from the WebView
                view.evaluateJavascript("document.querySelector('.article-content').innerHTML;",
                        html -> {
                            String newsContent = html.replaceAll("\"", "")
                                    .replaceAll("\\\\n", "\n")
                                    .replaceAll("\\\\u00A0", " ");
                            displayNewsContent(newsContent);
                        });
            }

            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                // Handle errors when loading the page
                displayErrorMessage("Error loading page");
            }
        });

        // Load the news detail URL into the WebView
        webView.loadUrl(newsDetailUrl);
    }

    private void displayNewsContent(String newsContent) {
        // Display the news content in a TextView
        // ...
    }

    private void displayErrorMessage(String message) {
        // Display an error message in a TextView
        // ...
    }
}