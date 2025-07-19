package com.ravyncoremobile.clean_architecture_principles_workshop.core

sealed class NetworkResource {
    data class Success<T>(val data: T) : NetworkResource()
    data class Error(val message: String) : NetworkResource()
    object Loading : NetworkResource()
    // A sealed class that represents the different states of network operations.
}