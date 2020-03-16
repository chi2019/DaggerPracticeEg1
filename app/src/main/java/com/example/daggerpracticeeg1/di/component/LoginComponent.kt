package com.example.daggerpracticeeg1.di.component

import com.example.daggerpracticeeg1.MainActivity
import dagger.Component

@Component
interface LoginComponent {

    fun inject(mainActivity: MainActivity)
}