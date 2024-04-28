package com.example.demo.port

import com.example.demo.user.model.User
import kotlinx.coroutines.flow.Flow

interface UserQueryPort {
    suspend fun getUser(id: Long): User?
    suspend fun findAll(): Flow<User>
}
