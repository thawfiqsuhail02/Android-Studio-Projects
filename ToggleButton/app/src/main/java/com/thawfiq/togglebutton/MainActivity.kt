package com.thawfiq.togglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toggleButton=findViewById(R.id.toggleButton) as ToggleButton
        toggleButton?.setOnCheckedChangeListener{buttonView,isChecked->
            var msg="The Toggle Button is: "+ if(isChecked) "ON" else "OFF"
            Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
        }

    }
}