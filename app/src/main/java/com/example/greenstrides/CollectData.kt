package com.example.greenstrides

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.Button

class CollectData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collect_data)

        if (supportActionBar != null)
            supportActionBar?.hide()

        val myWebView: WebView = findViewById<WebView>(R.id.collectDataWebview)
        myWebView.webViewClient = MyWebViewClient()
        myWebView!!.settings.javaScriptEnabled = true
        myWebView.loadUrl(UrlConstants.COLLECT_DATA_VIEW)

        val nextButton = findViewById<Button>(R.id.collectDataScreenNextButton)
        nextButton.setOnClickListener {
            val mainActivity = Intent(this, MainActivity::class.java)
            startActivity(mainActivity)
        }
    }



}