package com.vetcare.app.models

data class Cliente(
    val id: Int,
    val nombre: String,
    val apellido: String,
    val email: String,
    val telefono: String
)