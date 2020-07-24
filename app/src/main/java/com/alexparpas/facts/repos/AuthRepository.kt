package com.alexparpas.facts.repos

import com.alexparpas.facts.entities.User

class AuthRepository {
    fun getUser(): User =
        User(
            id = "123",
            name = "Alex",
            email = "alex@gmail.com",
            avatar = "avatar.com"
        )
}