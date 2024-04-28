package com.example.demo.converter

import com.example.demo.entity.UserEntity
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
