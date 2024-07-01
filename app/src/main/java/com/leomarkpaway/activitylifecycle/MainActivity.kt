package com.leomarkpaway.activitylifecycle

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showToastLong("onCreate")
    }

    private fun Context.showToastLong(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        showToastLong("onStart")
    }

    override fun onResume() {
        super.onResume()
        showToastLong("onResume")
    }


    override fun onPause() {
        super.onPause()
        showToastLong("onPause")
    }

    override fun onStop() {
        super.onStop()
        showToastLong("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        showToastLong("onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        showToastLong("onRestart")
    }

}