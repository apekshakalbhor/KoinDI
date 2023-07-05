package com.example.koindi.di

import com.example.koindi.demo.interfaces.DemoImpl
import com.example.koindi.demo.interfaces.DemoOne
import com.example.koindi.demo.interfaces.DemoTwo
import com.example.koindi.demo.interfaces.Main
import org.koin.dsl.binds
import org.koin.dsl.module

val interfaceModule = module {
     //  factory { DemoImpl() as DemoOne}      //not best way to implement

   // factory<DemoOne>{DemoImpl()}

  //  factory{ DemoImpl() } bind DemoOne::class

    factory { DemoImpl() } binds arrayOf(DemoOne::class, DemoTwo::class)
    factory { Main(get(),get()) }
}