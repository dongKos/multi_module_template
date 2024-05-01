package com.example.demo.user

import com.example.demo.user.model.User
import com.example.demo.user.port.`in`.UserUseCase
import com.example.demo.user.port.out.UserCommandPort
import com.example.demo.user.port.out.UserQueryPort
import kotlinx.coroutines.flow.Flow
import org.springframework.stereotype.Service

@Service
internal class UserService(
    private val userQueryPort: UserQueryPort,
    private val userCommandPort: UserCommandPort,
) : UserUseCase {
    override suspend fun createUser(name: String): User {
        return userCommandPort.createUser(User(name = name))
    }

    override suspend fun getUser(id: Long): User {
        return userQueryPort.getUser(id)
    }

    override suspend fun findAll(): Flow<User> {
        return userQueryPort.findAll()
    }
}
