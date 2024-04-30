package com.example.demo.user.port.out

import com.example.demo.user.model.User

interface UserCommandPort {
    suspend fun createUser(user: User): User
}
