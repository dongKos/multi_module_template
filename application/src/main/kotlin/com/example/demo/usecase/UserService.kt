package com.example.demo.usecase

import com.example.demo.user.model.User
import com.example.demo.port.UserCommandPort
import com.example.demo.port.UserQueryPort
import kotlinx.coroutines.flow.Flow
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userQueryPort: UserQueryPort,
    private val userCommandPort: UserCommandPort,
): UserUseCase {

    override suspend fun createUser(name: String): User {
        return userCommandPort.createUser(User(name = name))
    }

    override suspend fun getUser(id: Long): User? {
        return userQueryPort.getUser(id)
    }

    override suspend fun findAll(): Flow<User> {
        return userQueryPort.findAll()
    }
}
