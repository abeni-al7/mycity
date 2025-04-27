package com.example.mycity.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


enum class MyCityScreen {
    Categories,
    Places,
    Detail
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyCityAppBar(
    currentScreen: MyCityScreen,
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
) {
    CenterAlignedTopAppBar(
        title = {
            if (currentScreen == MyCityScreen.Categories) {
                Text(text = "My City")
            } else {
                Text(text = currentScreen.name)
            }
        },
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Back"
                    )
                }
            }
        }
    )
}

@Composable
fun MyCityApp() {
    val navController: NavHostController = rememberNavController()
    val viewModel = MyCityViewModel()
    val uiState = viewModel.uiState.collectAsState()

    Scaffold(
        topBar = {
            MyCityAppBar(
                currentScreen = uiState.value.currentScreen,
                canNavigateBack = navController.previousBackStackEntry != null,
                navigateUp = {
                    navController.navigateUp()
                }
            )
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = MyCityScreen.Categories.name
        ) {
            composable(route = MyCityScreen.Categories.name) {
                CategoriesScreen(
                    categories = uiState.value.categories,
                    onCategoryClick = {
                        viewModel.updateCurrentCategory(it)
                        navController.navigate(MyCityScreen.Places.name)
                    },
                    modifier = Modifier
                        .padding(innerPadding)
                        .fillMaxSize()
                )
            }

            composable(route = MyCityScreen.Places.name) {
                PlacesScreen(
                    places = uiState.value.places,
                    onPlaceClick = {
                        viewModel.updateCurrentPlace(it)
                        navController.navigate(MyCityScreen.Detail.name)
                    },
                    modifier = Modifier
                        .padding(innerPadding)
                        .fillMaxSize()
                )
            }

            composable(route = MyCityScreen.Detail.name) {
                DetailScreen(
                    place = uiState.value.currentPlace,
                    modifier = Modifier
                        .padding(innerPadding)
                        .fillMaxSize()
                )
            }
        }
    }

}
