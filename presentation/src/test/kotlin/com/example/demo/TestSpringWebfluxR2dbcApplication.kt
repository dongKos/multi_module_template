package com.example.demo

import org.springframework.boot.fromApplication
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.boot.with

@TestConfiguration(proxyBeanMethods = false)
class TestSpringWebfluxR2dbcApplication

fun main(args: Array<String>) {
    fromApplication<SpringWebfluxR2dbcApplication>().with(TestSpringWebfluxR2dbcApplication::class).run(*args)
}
