package com.example.romanox.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun HomeScreen(){
    Column {
        Text(text = "Bienvenido a RomanoX" +
                "En esta aplicación podras convertir los numeros decimales naturales a" +
                "Romanos")
    }
}