package com.example.demo.adapter

import com.example.demo.converter.UserConverter.toUser
import com.example.demo.converter.UserConverter.toUserEntity
import com.example.demo.repository.UserR2DBCRepository
import com.example.demo.user.model.User
import com.example.demo.port.UserCommandPort
import com.example.demo.port.UserQueryPort
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.springframework.stereotype.Repository

@Repository
class UserPersistanceAdapter(
    private val userR2DBCRepository: UserR2DBCRepository,
): UserQueryPort, UserCommandPort {

    override suspend fun createUser(user: User): User {
        return userR2DBCRepository.save(user.toUserEntity()).toUser()
    }

    override suspend fun getUser(id: Long): User? {
        return userR2DBCRepository.findById(id)?.toUser()
    }

    override suspend fun findAll(): Flow<User> {
        return userR2DBCRepository.findAll().map {
            it.toUser()
        }
    }
}
