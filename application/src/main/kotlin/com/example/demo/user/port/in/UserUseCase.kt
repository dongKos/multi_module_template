package com.example.demo.user.port.`in`

import com.example.demo.interfaces.IncomingPort
import com.example.demo.user.model.User
import kotlinx.coroutines.flow.Flow

interface UserUseCase : IncomingPort {
    suspend fun createUser(name: String): User

    suspend fun getUser(id: Long): User

    suspend fun findAll(): Flow<User>
}
