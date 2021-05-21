package com.thawfiq.toastcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.*
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val displayToast=findViewById(R.id.button2) as Button
        displayToast.setOnClickListener{
            Toast.makeText(this@MainActivity,"Thawfiq Toast Broo",Toast.LENGTH_LONG).show()
        }
        val Submit=findViewById(R.id.Submit) as Button
        val RG=findViewById(R.id.RG) as RadioGroup
        Submit.setOnClickListener {
            val Selection=RG.checkedRadioButtonId
            var radiobutton:RadioButton=findViewById(Selection)
            if(radiobutton.text=="Male")
                Toast.makeText(this,"Hello Mr",Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this,"Hello Mrs",Toast.LENGTH_LONG).show()

        }
        var calculate=findViewById(R.id.button9) as Button
        var checkBox2=findViewById(R.id.checkBox2) as CheckBox
        var checkBox3=findViewById(R.id.checkBox3) as CheckBox
        var checkBox4=findViewById(R.id.checkBox4) as CheckBox
        calculate.setOnClickListener{
            var amount=0
            val billprint=StringBuilder()
            billprint.append("Thawfiq's Mega Shopping Store")
            if(checkBox2.isChecked){
                billprint.append("\nIPhone is 42500Rs")
                amount+=42500
            }
            if(checkBox3.isChecked){
                billprint.append("\nJBL Earphones is 3000Rs")
                amount+=3000
            }
            if(checkBox4.isChecked){
                billprint.append("\nGaming Laptop is 105000Rs")
                amount+=105000
            }
            billprint.append("\nTotal Amount is: $amount")
            Toast.makeText(this,billprint.toString(),Toast.LENGTH_LONG).show()
        }
    }
//    fun showToast(view: View) {
//        Toast.makeText(applicationContext,"Thawfiq Toast Broo",Toast.LENGTH_LONG).show()
//    }
}