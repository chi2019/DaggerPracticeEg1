package com.example.daggerpracticeeg1.di

import android.util.Log
import javax.inject.Inject

class LoginService @Inject constructor() : ApiService {
    override fun authenticate(username: String, password: String): String {
        Log.d("ApiService", "authenticate($username,$password)")
        return "qwerty"
    }
}