package com.example.koindi.di

import com.example.koindi.demo.interfaces.Main
import com.example.koindi.demo.viewModel.MainViewModel
import com.example.koindi.demo.viewModel.Test
import com.example.koindi.demo.viewModel.testImpl
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module


val viewModelModule  = module {
      factory { testImpl() } bind Test::class
      viewModel{MainViewModel(get())}
}
