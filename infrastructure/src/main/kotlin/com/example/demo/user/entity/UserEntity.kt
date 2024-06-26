package com.example.demo.user.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table("user")
class UserEntity(
    @Id
    @Column("id") val id: Long = 0,
    @Column("name") val name: String,
)
