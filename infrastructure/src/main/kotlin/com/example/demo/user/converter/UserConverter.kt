package com.example.demo.user.converter

import com.example.demo.user.entity.UserEntity
import com.example.demo.user.model.User

object UserConverter {
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
