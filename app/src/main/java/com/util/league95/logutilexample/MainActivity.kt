package com.util.league95.logutilexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.util.league95.logutil.LogDebug

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LogDebug.d("sadasdasdas")
    }
}
