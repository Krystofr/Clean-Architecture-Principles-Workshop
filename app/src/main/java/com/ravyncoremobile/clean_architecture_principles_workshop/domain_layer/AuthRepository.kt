package com.ravyncoremobile.clean_architecture_principles_workshop.domain_layer

import com.ravyncoremobile.clean_architecture_principles_workshop.domain_layer.model.User

interface AuthRepository {
    suspend fun login(username: String, password: String): Result<Unit>
    suspend fun logout(): Result<Unit>
    suspend fun isLoggedIn(): Boolean
    suspend fun getCurrentUser(): Result<User>
}