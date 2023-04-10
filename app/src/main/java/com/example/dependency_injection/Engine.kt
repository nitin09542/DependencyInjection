package com.example.dependency_injection

import android.util.Log
import javax.inject.Inject

class Engine {
    @Inject
    constructor()

    fun getEngine() {
        Log.d("tag", "Engine running")
    }
}