package com.example.demo.user.port.out

import com.example.demo.interfaces.OutgoingPort
import com.example.demo.user.model.User

interface UserCommandPort : OutgoingPort {
    suspend fun createUser(user: User): User
}
