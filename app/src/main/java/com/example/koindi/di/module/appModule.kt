package com.example.koindi.di.module

import com.example.koindi.di.component.HelloRepository
import com.example.koindi.di.component.HelloRepositoryImpl
import com.example.koindi.di.component.MySimplePresenter
import com.example.koindi.di.component.MyViewModel
import com.example.koindi.java.di.MyJavaPresenter
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    // single instance of HelloRepository
    single<HelloRepository> { HelloRepositoryImpl() }

    // Simple Presenter Factory
    factory { MySimplePresenter(get()) }
}

val viewModelModule = module {
    viewModel { MyViewModel(get()) }
}

val javaModule = module {
    factory { MyJavaPresenter(get()) }
}