package com.example.demo.user.dto

import com.example.demo.user.model.User

data class UserResponse(
    val id: Long,
    val name: String,
) {
    companion object {
        operator fun invoke(user: User) : UserResponse {
            return UserResponse(
                id = user.id,
                name = user.name,
            )
        }
    }
}
