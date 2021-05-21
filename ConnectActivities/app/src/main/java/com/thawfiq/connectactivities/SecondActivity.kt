package com.thawfiq.connectactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_main)

        var view=findViewById<TextView>(R.id.view)
        val bundle:Bundle?=intent.extras
        val msg=bundle!!.getString("Kotlin")
        view.text=msg

    }
}