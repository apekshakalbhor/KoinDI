package com.example.koindi.demo

import android.util.Log
import kotlin.math.log

class Car constructor(private val engine:Engine, private val wheel:Wheel){
    fun getCar(){
        engine.getEngine()
        wheel.getWheel()
        Log.d("main", "Car is running ")
    }
}

class Engine{
    fun getEngine(){
        Log.d("main", "Engine started")
    }
}

class Wheel{
    fun getWheel(){
        Log.d("main", "Wheel is ready")
    }
}