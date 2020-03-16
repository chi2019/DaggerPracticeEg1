package com.example.daggerpracticeeg1.di.module

import com.example.daggerpracticeeg1.di.LocalStore
import dagger.Module
import dagger.Provides

@Module
class LocalStoreModule {
    @Provides
    fun provideLocalStore() = LocalStore()
}