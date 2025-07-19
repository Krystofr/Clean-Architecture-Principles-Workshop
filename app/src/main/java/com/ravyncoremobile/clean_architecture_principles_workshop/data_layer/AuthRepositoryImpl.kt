package com.ravyncoremobile.clean_architecture_principles_workshop.data_layer

import com.ravyncoremobile.clean_architecture_principles_workshop.domain_layer.AuthRepository
import com.ravyncoremobile.clean_architecture_principles_workshop.domain_layer.model.User

class AuthRepositoryImpl : AuthRepository {
    override suspend fun login(
        username: String,
        password: String
    ): Result<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun logout(): Result<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun isLoggedIn(): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun getCurrentUser(): Result<User> {
        TODO("Not yet implemented")
    }


}