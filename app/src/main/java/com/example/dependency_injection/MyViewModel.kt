package com.example.dependency_injection

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MyViewModel @Inject constructor(private val userRepository: UserRepository) : ViewModel() {
    fun getUser(id: Int): User {
        return userRepository.getUser(id)
    }

    fun addUser(user: User) {
        userRepository.addUser(user)
    }
}