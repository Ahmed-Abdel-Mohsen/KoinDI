package com.example.koindi.di.module

import com.example.koindi.di.component.MySimplePresenter
import com.example.koindi.java.JavaActivity
import org.koin.dsl.module

val scopedModule = module {
    scope<JavaActivity> {
        scoped { MySimplePresenter(get()) }
    }
}