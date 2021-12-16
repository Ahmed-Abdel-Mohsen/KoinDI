package com.example.koindi.di.component

import androidx.lifecycle.ViewModel

class MyViewModel(private val repo: HelloRepository) : ViewModel() {
    fun sayHello() = "${repo.giveHello()} + $this"
}