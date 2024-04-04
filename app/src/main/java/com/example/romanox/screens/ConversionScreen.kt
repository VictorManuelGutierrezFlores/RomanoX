package com.example.romanox.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.romanox.decimalARomano
import com.example.romanox.navigation.AppScreens

@Composable
fun ConversionScreen(navController: NavController){
    // INIT VARIABLE
    var setNumber by remember {
        mutableStateOf("0")
    }
    var convertedNumber by remember {
        mutableStateOf("0")
    }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
    ) {
        Text(text = "Escribe un número para convertirlo a Romano")
        OutlinedTextField(
            value = setNumber,
            onValueChange = { newNumber ->
                if (newNumber.all { it.isDigit() || it == '.' })
                {
                    setNumber = newNumber
                }
            },
            label = { Text(text = "Número") },
            modifier = Modifier
                    .padding(10.dp),
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
        )
        Button(onClick = {
            val parsedNumber = setNumber.toInt()
            if ( parsedNumber != 0 && parsedNumber > 0){
                convertedNumber = decimalARomano(parsedNumber)
            }
        },
               modifier = Modifier
                       .padding(10.dp)
               ) {
            Text(text ="Convertir")
        }
        if ( convertedNumber.isNotEmpty() ){
            Text(text ="El numero $setNumber en romano es $convertedNumber")
        }
        HorizontalDivider()
        Button(onClick = {
            navController.navigate(route = AppScreens.HomeScreen.route)
        },
               modifier = Modifier
                       .padding(10.dp)
        ) {
            Text(text = "Comenzar")
        }
    }
}

@Composable
fun HorizontalDivider(
    modifier: Modifier = Modifier,
    thickness: Dp = DividerDefaults.Thickness,
    color: Color = DividerDefaults.color,
)
{
}