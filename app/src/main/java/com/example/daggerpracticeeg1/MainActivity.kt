package com.example.daggerpracticeeg1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerpracticeeg1.di.component.DaggerLoginComponent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loginComponent = DaggerLoginComponent.create()
        loginComponent.getLoginManager().login("abc", "123")
    }
}
