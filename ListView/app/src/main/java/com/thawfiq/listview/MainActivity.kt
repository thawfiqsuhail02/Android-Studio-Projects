package com.thawfiq.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    var cityArray= arrayOf("Chennai","Salem","Trichy","Madurai","Ilayangudi","Sivagangai","Mettur")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter=ArrayAdapter(this, R.layout.listview_item, cityArray)

        val listView:ListView=findViewById(R.id.listviewparent)

        listView.setAdapter(adapter)

    }
}