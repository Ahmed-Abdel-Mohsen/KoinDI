package com.example.koindi.di.component

interface HelloRepository {
    fun giveHello(): String
}

class HelloRepositoryImpl : HelloRepository {
    override fun giveHello() = "Hello Koin"
}