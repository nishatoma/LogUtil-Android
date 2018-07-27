package com.util.league95.errorutil

import android.util.Log

class ErrorDebug {
    companion object {
        private const val TAG = "SUPER_Awesome"
    }

    fun d(message: String) {
        Log.d(TAG, message)
    }
}