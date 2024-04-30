package com.example.demo.user.converter

import com.example.demo.user.dto.UserResponse
import com.example.demo.user.model.User

object UserPresentationConverter {
    fun User.toUserResponse(): UserResponse {
        return UserResponse(
            id = id,
            name = name,
        )
    }
}
