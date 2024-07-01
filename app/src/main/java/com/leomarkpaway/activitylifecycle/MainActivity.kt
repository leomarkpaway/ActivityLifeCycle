package com.leomarkpaway.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.d("Status","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Status","onResume")
    }


    override fun onPause() {
        super.onPause()
        Log.d("Status","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Status","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Status","onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Status","onRestart")
    }

}