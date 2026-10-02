package com.example.matule

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.HOME
    ){
        composable(Routes.HOME){HomeScreen(navController)}
        composable(Routes.LOGIN){LoginScreen(navController)}
        composable(Routes.REGISTER){RegisterScreen(navController)}
        composable(Routes.CATALOG){CatalogScreen(navController)}
        composable(Routes.PROFILE){ProfileScreen(navController)}
        composable(Routes.SETTINGS){SettingsScreen(navController)}
    }
}