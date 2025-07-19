package com.ravyncoremobile.clean_architecture_principles_workshop.domain_layer.usecase

import com.ravyncoremobile.clean_architecture_principles_workshop.domain_layer.AuthRepository

class LoginUseCase (
    private val authRepository: AuthRepository
) {
    suspend operator fun invoke(username: String, password: String): Result<Unit> {
        return authRepository.login(username, password)
    }
}