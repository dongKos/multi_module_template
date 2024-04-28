package com.example.demo.controller

import com.example.demo.dto.UserResponse
import com.example.demo.usecase.UserUseCase
import com.example.demo.controller.UserController.Companion.USER_PATH
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(USER_PATH)
class UserController(
    private val userUseCase: UserUseCase,
) {

    companion object {
        private const val API_PREFIX = "/api"
        private const val VERSION_PREFIX = "/v1"
        private const val SERVICE_NAME = "/users"
        const val USER_PATH = "$API_PREFIX$VERSION_PREFIX$SERVICE_NAME"
    }

    @PostMapping
    suspend fun createUser(
        @RequestParam name: String,
    ): UserResponse {
        return UserResponse(userUseCase.createUser(name = name))
    }

    @GetMapping("/{id}")
    suspend fun findByIdOrNull(
        @PathVariable id: Long,
    ): UserResponse? {
        return userUseCase.getUser(id = id)?.let {
            UserResponse(it)
        }
    }

    @GetMapping
    suspend fun findAll(): Flow<UserResponse> {
        return userUseCase.findAll().map {
            UserResponse(it)
        }
    }
}
