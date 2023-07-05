package com.example.koindi.container

import com.example.koindi.demo.Car
import com.example.koindi.demo.Engine
import com.example.koindi.demo.interfaces.Main
import com.example.koindi.demo.viewModel.MainViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class Component :KoinComponent {
    // lazily
    val car: Car by inject()

    //eagerly
   // val car1:Car = get()

    val engine : Engine by inject()

    val main : Main by inject()

    val mainViewModel : MainViewModel by inject()
}