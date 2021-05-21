package com.thawfiq.snakbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn=findViewById(R.id.btn1) as Button
        btn.setOnClickListener{
            var snack = Snackbar.make(it,"This is Thawfiq's Snakbar",Snackbar.LENGTH_LONG)
            snack.show()
        }
    }
}