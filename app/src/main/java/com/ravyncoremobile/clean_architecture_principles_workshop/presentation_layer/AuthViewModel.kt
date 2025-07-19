package com.ravyncoremobile.clean_architecture_principles_workshop.presentation_layer

import androidx.lifecycle.ViewModel
import com.ravyncoremobile.clean_architecture_principles_workshop.domain_layer.usecase.LoginUseCase

class AuthViewModel(
    private val loginUseCase: LoginUseCase
) : ViewModel() {


}