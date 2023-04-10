package com.example.dependency_injection

import android.util.Log
import javax.inject.Inject

class Car @Inject
constructor(var engine: Engine, var wheel: Wheel) {


    fun getCar() {
        engine.getEngine()
        wheel.getWheel()
        Log.d("TAG", "Car is Running")
    }
}