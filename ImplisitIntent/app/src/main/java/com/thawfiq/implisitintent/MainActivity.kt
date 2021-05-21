package com.thawfiq.implisitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        send.setOnClickListener{
            var msg:String=ETName.text.toString()
            val intent= Intent()

            intent.action=Intent.ACTION_SEND

            intent.putExtra(Intent.EXTRA_TEXT,msg)

            intent.type="text/plain"

            startActivity(Intent.createChooser(intent,"Share via"))

        }

    }
}