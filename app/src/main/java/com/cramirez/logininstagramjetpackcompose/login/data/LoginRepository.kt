package com.cramirez.logininstagramjetpackcompose.login.data

import com.cramirez.logininstagramjetpackcompose.login.data.network.LoginService

class LoginRepository {
    private val api = LoginService()

    suspend fun doLogin(user: String, password:String): Boolean {
        return api.doLogin(user, password)
    }
}