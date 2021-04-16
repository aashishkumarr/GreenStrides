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
    val OBSERVABLE_NOTEBOOK_URL ="https://observablehq.com/embed/14ab270eb83c3ec2?cells=viewof+datasetSelector%2Cviewof+goal%2Cviewof+timeSelector%2Cbarchart%2Cviewof+monthSelector%2Cchart%2Cchart2"
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_visualization, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val myWebView: WebView = view.findViewById<WebView>(R.id.visualizationWebview)
        myWebView.webViewClient = MyWebViewClient(this)
        myWebView!!.settings.javaScriptEnabled = true
        myWebView.loadUrl(OBSERVABLE_NOTEBOOK_URL)
    }

    class MyWebViewClient internal constructor(private val activity: Fragment) : WebViewClient() {

        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
            val url: String = request?.url.toString();
            view?.loadUrl(url)
            return true
        }

        override fun shouldOverrideUrlLoading(webView: WebView, url: String): Boolean {
            webView.loadUrl(url)
            return true
        }

        override fun onReceivedError(view: WebView, request: WebResourceRequest, error: WebResourceError) {
            Toast.makeText(activity.activity, "Got Error! $error", Toast.LENGTH_SHORT).show()
            Log.e("ERROR_WEBVIEW",error.toString())
        }
    }
}