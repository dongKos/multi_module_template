package com.example.demo.port

import com.example.demo.user.model.User

interface UserCommandPort {
    suspend fun createUser(user: User): User
}
