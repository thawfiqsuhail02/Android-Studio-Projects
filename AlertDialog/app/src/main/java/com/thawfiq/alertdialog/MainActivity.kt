package com.thawfiq.alertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener{
            var dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage("Do you want to Purchase this IPhone SE 2?")
                .setPositiveButton("Yes", DialogInterface.OnClickListener{dialog,id->finish()})
                .setNegativeButton("Cancel",DialogInterface.OnClickListener{dialog,id->dialog.cancel()})
            val alert=dialogBuilder.create()
            alert.setTitle("Purchase")
            alert.show()
        }

    }
}