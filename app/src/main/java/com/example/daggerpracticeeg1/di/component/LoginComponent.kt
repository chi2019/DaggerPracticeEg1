package com.example.daggerpracticeeg1.di.component

import com.example.daggerpracticeeg1.MainActivity
import com.example.daggerpracticeeg1.di.module.LocalStoreModule
import com.example.daggerpracticeeg1.di.module.LoginServiceModule
import dagger.Component

@Component(modules = [LocalStoreModule::class, LoginServiceModule::class])
interface LoginComponent {
    fun inject(mainActivity: MainActivity)
}