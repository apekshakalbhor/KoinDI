package com.example.koindi.demo.viewModel

import android.util.Log

interface Test{
    fun getTest()
}

class testImpl : Test{
    override fun getTest() {
        Log.d("main", "View Model")
    }
}