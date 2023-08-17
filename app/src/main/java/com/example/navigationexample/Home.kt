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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController

@Composable
fun HomeUI(navController: NavHostController) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(MaterialTheme.colorScheme.tertiary)
            .fillMaxSize()
    ) {
        
        Image(
            painter = painterResource(id = R.drawable.lg),
            contentDescription = "")
        Text(
            text = "Home",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier
        )
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
            navController.navigate(Destination.New.route)
        }) {
            Text(text = "New Page")
        }

    }

}

@Composable
@Preview
fun HomePreview() {
    //HomeUI(navController)
}