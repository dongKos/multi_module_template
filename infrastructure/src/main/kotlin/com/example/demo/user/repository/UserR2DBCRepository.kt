package com.example.demo.user.repository

import com.example.demo.user.entity.UserEntity
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserR2DBCRepository: CoroutineCrudRepository<UserEntity, Long> {
}
