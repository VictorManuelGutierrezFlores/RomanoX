package com.example.romanox.navigation
/**
 * THIS CLASS PROVIDE TO NAVCONTROLL A LIMITED SCREENS TO USE
 * FOR NAVIGATE
 * */
sealed class AppScreens(val route:String)
{
    object HomeScreen: AppScreens("homescreen")
    object ConversionScreen: AppScreens("conversion screen")
}