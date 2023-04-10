package com.example.dependency_injection

import javax.inject.Inject

data class User @Inject constructor(var id: Int, var name: String)
