package com.example.daggerpracticeeg1.di

import android.util.Log
import javax.inject.Inject

class LoginManager @Inject constructor(val localStore: LocalStore, val apiService: ApiService) {

    fun login(username: String, pass: String) {
        Log.d("LoginManager", "login($username,$pass)")
        val token = apiService.authenticate(username, pass)
        localStore.saveToken(token)
    }

    @Inject
    fun enableCache(config: Config) {
        Log.d("LoginManager", "${config.isCachEnabled}")
        config.enableCache(this)
    }
}