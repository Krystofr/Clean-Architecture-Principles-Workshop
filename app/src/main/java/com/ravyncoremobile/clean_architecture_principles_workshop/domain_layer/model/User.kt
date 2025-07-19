package com.ravyncoremobile.clean_architecture_principles_workshop.domain_layer.model

data class User(
    val id: String,
    val username: String,
    val email: String? = null,
    val fullName: String? = null,
    val profilePictureUrl: String? = null
)