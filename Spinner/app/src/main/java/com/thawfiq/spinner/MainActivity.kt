package com.thawfiq.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countries=arrayOf<String>("India","Pakistan","Dubai","America","Canada","Iceland","Africa","Palestine")
        val spinner=findViewById<Spinner>(R.id.spinner),
        if(spinner!=null){
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, countries)
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    Toast.makeText(this@MainActivity, getString(R.string.selected_item) + " " + "" + countries[position], Toast.LENGTH_SHORT).show()
                }
                override fun onNothingSelected(parent: AdapterView<*>) {
                    Toast.makeText(this@MainActivity, "Select an Item.", Toast.LENGTH_SHORT).show()
                }
            }
        }

    }
}