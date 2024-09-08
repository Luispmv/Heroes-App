package com.example.heroesapp.models

//Creando una lista de usuarios con nombre y contraseña
data class User(val email:String, val password: String){
    companion object{
        val users = listOf(
            User("luismujica024085@gmail.com", "12345"),
            User("mario23@gmail.com", "12345"),
            User("gabriel02@gmail.com", "12345")
        )
    }
}
