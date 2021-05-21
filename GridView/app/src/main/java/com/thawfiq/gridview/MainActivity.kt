package com.thawfiq.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val grid_view=findViewById<GridView>(R.id.gridView1)
        val text_view=findViewById<TextView>(R.id.textView1)
        val mixed= listOf<String>("India","Jack Sparrow","Dubai","Emma Watson","Aquaman","Harry Potter","Alice Wonderland","Thawfiq's land","Brooo")
        val adapter=ArrayAdapter(this,android.R.layout.simple_spinner_item,mixed)
        grid_view.adapter=adapter
        grid_view.onItemClickListener= object : AdapterView.OnItemClickListener {
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedItem = parent?.getItemAtPosition(position).toString()
                text_view.text = "GridView item clicked: $selectedItem \nAt index position : $position"
            }

        }
    }
}