package com.example.dependency_injection

import android.util.Log
import javax.inject.Inject

class Wheel {
    @Inject
    constructor()

    fun getWheel() {
        Log.d("tag", "Wheel is running")
    }
}