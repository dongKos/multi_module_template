package com.example.demo.user.converter

import com.example.demo.user.entity.UserEntity
import com.example.demo.user.model.User

object UserPersistenceConverter {
    fun UserEntity.toUser(): User {
        return User(
            id = id,
            name = name,
        )
    }

    fun User.toUserEntity(): UserEntity {
        return UserEntity(
            id = id,
            name = name,
        )
    }
}
