package com.thawfiq.connectactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var send:Button=findViewById(R.id.send)
        var name:EditText=findViewById(R.id.editTextTextPersonName)
        send.setOnClickListener{
            var msg:String=name.text.toString()
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("Kotlin",msg)
            startActivity(intent)
        }
    }
}