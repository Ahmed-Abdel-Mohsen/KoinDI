package com.example.koindi.di.component

import androidx.lifecycle.ViewModel

class ParameterizeViewModel(
    private val repo: HelloRepository,
    private val id: String,
    private val name: String
) :
    ViewModel() {
    fun sayHello() = "${repo.giveHello()} to $name id=$id from $this"
}