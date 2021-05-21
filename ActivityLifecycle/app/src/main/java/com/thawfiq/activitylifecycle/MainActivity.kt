package com.thawfiq.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        print("Process Created")
    }

    override fun onStart(){
        super.onStart()
        print("Process Started")
    }

    override fun onResume(){
        super.onResume()
        print("Process Resumed")
    }

    override fun onPause(){
        super.onPause()
        print("Process Paused")
    }

    override fun onStop(){
        super.onStop()
        print("Process Stopped")
    }

    override fun onRestart(){
        super.onRestart()
        print("Process Restarted")
    }

    override fun onDestroy(){
        super.onDestroy()
        print("Process Destroyed")
    }

    fun print(msg:String){
        Log.d("The Activity State is: ", msg)
    }
}