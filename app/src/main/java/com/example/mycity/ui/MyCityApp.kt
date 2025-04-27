package com.example.mycity.ui

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


enum class MyCityScreen {
    Categories,
    Places,
    Detail
}

@Composable
fun MyCityApp(
    appBar: @Composable () -> Unit = {},
) {
    val navController: NavHostController = rememberNavController()
    Scaffold(
        topBar = appBar
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = MyCityScreen.Categories.name
        ) {
            composable(route = MyCityScreen.Categories.name) {
                CategoriesScreen(

                )
            }
        }
    }

}
