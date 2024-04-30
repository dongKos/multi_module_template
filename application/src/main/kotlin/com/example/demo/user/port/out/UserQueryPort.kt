package com.example.demo.user.port.out

import com.example.demo.user.model.User
import kotlinx.coroutines.flow.Flow

interface UserQueryPort {
    suspend fun getUser(id: Long): User

    suspend fun findAll(): Flow<User>
}
