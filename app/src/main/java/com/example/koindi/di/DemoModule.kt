package com.example.koindi.di

import com.example.koindi.demo.Car
import com.example.koindi.demo.Engine
import com.example.koindi.demo.Wheel
import org.koin.dsl.module

val demoModule = module {
    factory { Wheel() }
    factory { Engine() }
    factory { Car(get(),get()) }
}

