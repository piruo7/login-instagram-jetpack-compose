package com.cramirez.logininstagramjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.cramirez.logininstagramjetpackcompose.login.ui.LoginScreen
import com.cramirez.logininstagramjetpackcompose.login.ui.LoginViewModel
import com.cramirez.logininstagramjetpackcompose.ui.theme.LoginInstagramJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginInstagramJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginScreen(LoginViewModel())
                }
            }
        }
    }
}