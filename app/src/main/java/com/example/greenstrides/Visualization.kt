package com.example.greenstrides

import android.app.Activity
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceError
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import java.util.*

class Visualization : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_visualization, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val myWebView: WebView = view.findViewById<WebView>(R.id.visualizationWebview)
        myWebView.webViewClient = MyWebViewClient()
        myWebView!!.settings.javaScriptEnabled = true
        myWebView.loadUrl(UrlConstants.VISUALIZATION_VIEW)
    }


}