package com.example.intent_calc_web

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class WebActivity : AppCompatActivity() {
    lateinit var mywebview:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        mywebview=findViewById(R.id.webView)
        youtubeweb()
    }
    private fun youtubeweb(){
        mywebview.webViewClient= WebViewClient()
        mywebview.apply {
            loadUrl("https://www.youtube.com/")
            settings.javaScriptEnabled
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                settings.safeBrowsingEnabled
            }

        }
    }
}