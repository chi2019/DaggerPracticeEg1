package com.example.daggerpracticeeg1.di

import android.util.Log
import javax.inject.Inject

class Config @Inject constructor() {
    var isCachEnabled = false
    fun enableCache(loginManager: LoginManager) {
        isCachEnabled = true
        Log.d("Config", "${this.isCachEnabled}")
    }
}