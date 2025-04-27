package com.example.mycity.ui

import com.example.mycity.data.Categories
import com.example.mycity.data.Category
import com.example.mycity.data.Place
import com.example.mycity.data.Restaurants

data class MyCityUiState(
    val categories: List<Category> = emptyList(),
    val places: List<Place> = emptyList(),
    val currentCategory: Category = Categories.defaultCategory,
    val currentPlace: Place = Restaurants.defaultRestaurant,
    val currentScreen: MyCityScreen = MyCityScreen.Categories
)
