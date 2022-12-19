package com.zeus.batik_app.navigation

sealed class Routes(val route: String) {
    object Login : Routes("Login")
//    object HomeScreen : Routes("Home")
}