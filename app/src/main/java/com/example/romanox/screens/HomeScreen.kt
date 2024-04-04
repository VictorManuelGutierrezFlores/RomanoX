package com.example.romanox.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.romanox.R
import com.example.romanox.navigation.AppScreens

@Composable
fun HomeScreen(navController: NavController){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = painterResource(R.drawable.romanoxlogobydesigner), contentDescription = "RomanoX Logo")
        Text(text ="Bienvenido A RomanoX \n" +
                "Aplicacion dedicada a la conversion de números naturales a" +
                "números romanos")
        Button(onClick = {
            navController.navigate(route = AppScreens.ConversionScreen.route)
        },
               modifier = Modifier
                       .padding(10.dp)
               ) {
            Text(text = "Comenzar")
        }
    }
}