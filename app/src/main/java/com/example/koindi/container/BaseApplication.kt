package com.example.koindi.container

import android.app.Application
import androidx.lifecycle.ViewModel
import com.example.koindi.di.demoModule
import com.example.koindi.di.interfaceModule
import com.example.koindi.di.viewModelModule
import org.koin.core.context.startKoin

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin(){
            modules(demoModule, interfaceModule, viewModelModule)
        }
    }
}