package com.thawfiq.seekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.* //important

class MainActivity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {

    var progressView: TextView?=null
    var statusView: TextView?=null
    var seekbarView: SeekBar?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        progressView=this.progressNumber
        statusView=this.progressMessage
        seekbarView=this.seekBar1
        seekbarView!!.setOnSeekBarChangeListener(this)
    }

    override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean){
        progressView!!.text = progress.toString()
        statusView!!.text = "Tracking Touch"
    }

    override fun onStartTrackingTouch(seekBar: SeekBar){
        statusView!!.text = "Started Tracking Touch"
    }

    override fun onStopTrackingTouch(seekBar: SeekBar){
        statusView!!.text = "Stopped Tracking Touch"
    }
}