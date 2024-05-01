package com.example.demo.user.adapter.out

import com.example.demo.annotation.OutgoingAdapter
import com.example.demo.user.converter.UserPersistenceConverter.toUser
import com.example.demo.user.converter.UserPersistenceConverter.toUserEntity
import com.example.demo.user.exception.UserDomainException
import com.example.demo.user.model.User
import com.example.demo.user.port.out.UserCommandPort
import com.example.demo.user.port.out.UserQueryPort
import com.example.demo.user.repository.UserR2DBCRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.springframework.stereotype.Repository

@OutgoingAdapter
@Repository
internal class UserPersistenceAdapter(
    private val userR2DBCRepository: UserR2DBCRepository,
) : UserQueryPort, UserCommandPort {
    override suspend fun createUser(user: User): User {
        return userR2DBCRepository.save(user.toUserEntity()).toUser()
    }

    override suspend fun getUser(id: Long): User {
        return userR2DBCRepository.findById(id)?.toUser()
            ?: throw UserDomainException("User with id $id not found")
    }

    override suspend fun findAll(): Flow<User> {
        return userR2DBCRepository.findAll().map {
            it.toUser()
        }
    }
}
