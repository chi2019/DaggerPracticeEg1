package com.example.daggerpracticeeg1.di.module

import com.example.daggerpracticeeg1.di.ApiService
import com.example.daggerpracticeeg1.di.LoginService
import dagger.Binds
import dagger.Module

@Module
abstract class LoginServiceModule {
    @Binds
    abstract fun bindLoginService(loginService: LoginService): ApiService
}