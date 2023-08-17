package com.example.navigationexample

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController


@Composable
fun WelcomeScreenUI(navController: NavHostController) {
    Column(
        verticalArrangement  = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()

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
            navController.navigate(Destination.New.route)
        }) {
            Text(text = "New Page")
        }
        Button(onClick = {
            navController.navigate(Destination.Home.route)
        }) {
            Text(text = "Home Page")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun WelcomeScreenPreview(){
    //WelcomeScreenUI(navController)
}


