package com.example.koindi.demo.interfaces

import android.util.Log

interface DemoOne{
    fun getDemoOne()
}

interface DemoTwo{
    fun getDemoTwo()
}
class DemoImpl : DemoOne,DemoTwo {
    override fun getDemoOne() {
        Log.d("main", "This is demoOne")
    }

    override fun getDemoTwo() {
        Log.d("main", "This is demoTwo")
    }
}

class Main(private val demoOne: DemoOne,private val demoTwo: DemoTwo){
    fun getDemo(){
        demoOne.getDemoOne()
        demoTwo.getDemoTwo()
    }
}