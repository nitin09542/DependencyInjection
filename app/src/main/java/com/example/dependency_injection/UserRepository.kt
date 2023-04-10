package com.example.dependency_injection

interface UserRepository {
    fun getUser(id: Int): User
    fun addUser(user: User)
}
