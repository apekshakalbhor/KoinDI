package com.example.koindi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.koindi.container.Component

class MainActivity : AppCompatActivity() {
   // private val car : Car by inject()   not better way to inject dependency here

    private val component = Component()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //component.car.getCar()
      //  component.main.getDemo()

        component.mainViewModel.getTest()
    }
}