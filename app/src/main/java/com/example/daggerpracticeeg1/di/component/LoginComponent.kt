package com.example.daggerpracticeeg1.di.component

import com.example.daggerpracticeeg1.di.LoginManager
import dagger.Component

@Component
interface LoginComponent {
    fun getLoginManager(): LoginManager
}