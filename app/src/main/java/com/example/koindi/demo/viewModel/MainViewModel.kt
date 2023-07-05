package com.example.koindi.demo.viewModel

import androidx.lifecycle.ViewModel

class MainViewModel constructor(private val test: Test):ViewModel() {
    fun getTest(){
        test.getTest()
    }
}