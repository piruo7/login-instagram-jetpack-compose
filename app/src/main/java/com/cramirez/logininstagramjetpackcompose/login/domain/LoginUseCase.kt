package com.cramirez.logininstagramjetpackcompose.login.domain

import com.cramirez.logininstagramjetpackcompose.login.data.LoginRepository

class LoginUseCase {
    private val repository = LoginRepository()

    suspend operator fun invoke(user:String, password:String):Boolean{
        return repository.doLogin(user, password)
    }
}