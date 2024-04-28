package com.example.demo.repository

import com.example.demo.entity.UserEntity
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserR2DBCRepository: CoroutineCrudRepository<UserEntity, Long> {
}
