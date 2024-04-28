package com.example.demo.user.exception

import com.example.demo.exception.DomainException

class UserDomainException(
    override val message: String,
): DomainException(message)
