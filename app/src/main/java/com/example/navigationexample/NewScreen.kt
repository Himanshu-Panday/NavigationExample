package com.example.navigationexample

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController

@Composable
fun NewScreenUI(navController: NavHostController) {
    Column(
        verticalArrangement  = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.error)

    ) {
        Image(
            painter = painterResource(id = R.drawable.lg),
            contentDescription = "",
        )

        Text(text = "Welcome")
        Button(onClick = {
//            navController.navigate(Destination.Home.route)
            navController.popBackStack()
        }) {
            Text(text = "Return")
        }
        Button(onClick = {
            navController.navigate(Destination.Welcome.route)
        }) {
            Text(text = "Welcome Page")
        }
        Button(onClick = {
            navController.navigate(Destination.Home.route)
        }) {
            Text(text = "Home Page")
        }
    }
}