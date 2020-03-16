package com.example.daggerpracticeeg1.di

import android.util.Log
import javax.inject.Inject

class LocalStore @Inject constructor() {
    fun saveToken(token: String) {
        Log.d("LocalStore", "saveToken($token)")
    }
}