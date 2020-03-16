package com.example.daggerpracticeeg1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerpracticeeg1.di.LoginManager
import com.example.daggerpracticeeg1.di.component.DaggerLoginComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var loginManager: LoginManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loginComponent = DaggerLoginComponent.create()
        loginComponent.inject(this)
        loginManager.login("abc", "123")
    }
}
