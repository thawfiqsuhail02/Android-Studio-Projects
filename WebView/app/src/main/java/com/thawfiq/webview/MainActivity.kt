package com.thawfiq.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myWebView.loadUrl("https://stackoverflow.com/questions/58547095/how-to-connect-ml-model-which-is-made-in-python-to-react-native-app")
        val webSettings = myWebView.settings
        webSettings.javaScriptEnabled = true
    }
}