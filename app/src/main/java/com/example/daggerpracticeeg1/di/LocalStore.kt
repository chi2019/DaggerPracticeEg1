package com.example.daggerpracticeeg1.di

import android.util.Log

class LocalStore {
    fun saveToken(token: String) {
        Log.d("LocalStore", "saveToken($token)")
    }
}