package com.example.daggerpracticeeg1.di

interface ApiService {
    fun authenticate(username: String, password: String): String
}