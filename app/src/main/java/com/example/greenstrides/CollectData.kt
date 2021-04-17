package com.example.greenstrides

import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CollectData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collect_data)

        if (supportActionBar != null)
            supportActionBar?.hide()

        val myWebView: WebView = findViewById(R.id.collectDataWebview)
        myWebView.webViewClient = MyWebViewClient()
        myWebView.settings.javaScriptEnabled = true
        myWebView.loadUrl(UrlConstants.COLLECT_DATA_VIEW)

        val nextButton = findViewById<Button>(R.id.collectDataScreenNextButton)
        nextButton.setOnClickListener {
            val settings = getSharedPreferences("green_strides", 0)
            val editor = settings.edit()
            editor.putBoolean("firstTimeUser", false)
            editor.apply()
            val mainActivity = Intent(this, MainActivity::class.java)
            startActivity(mainActivity)
        }
    }



}