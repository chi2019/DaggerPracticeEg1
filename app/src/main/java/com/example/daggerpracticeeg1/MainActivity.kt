package com.example.daggerpracticeeg1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerpracticeeg1.di.ApiService
import com.example.daggerpracticeeg1.di.LocalStore
import com.example.daggerpracticeeg1.di.LoginManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val localStore = LocalStore("fgjshkfjlkvf")
        val apiService = ApiService("ram", "123")
        val manager = LoginManager(localStore, apiService)
    }
}
