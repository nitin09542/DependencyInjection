package com.example.dependency_injection

class UserRepositoryImpl : UserRepository {
    private val users = mutableListOf<User>()

    override fun getUser(id: Int): User {
        return users.firstOrNull { it.id == id } ?: throw NoSuchElementException("No user found with ID $id")
    }

    override fun addUser(user: User) {
        users.add(user)
    }
}
