package com.example.koindi.core

import android.app.Application
import com.example.koindi.di.module.appModule
import com.example.koindi.di.module.javaModule
import com.example.koindi.di.module.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        startKoin {
            androidLogger(Level.DEBUG)

            androidContext(this@MyApplication)

            modules(appModule, viewModelModule, javaModule)
        }
    }
}