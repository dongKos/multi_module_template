package com.example.demo.user.model

import com.example.demo.user.exception.UserDomainException

data class User(
    val id: Long = 0,
    val name: String,
) {
    init {
        if (name.isBlank()) throw UserDomainException("Name must not be blank")
    }
}
