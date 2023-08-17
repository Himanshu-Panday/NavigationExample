package com.example.navigationexample

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

sealed class Destination(val route: String){
    object Welcome: Destination("welcome")
    object Home: Destination("home")
    object New: Destination("new")

}

@Composable
fun MyNavigationHost(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Destination.Welcome.route
    ){
        composable(Destination.Welcome.route){ WelcomeScreenUI(navController) }
        composable(Destination.Home.route){ HomeUI(navController) }
        composable(Destination.New.route){ NewScreenUI(navController) }

    }
}