package com.example.mycity.ui

import com.example.mycity.data.Category
import com.example.mycity.data.Place

data class MyCityUiState(
    val categories: List<Category> = emptyList(),
    val places: List<Place> = emptyList(),
    val currentCategory: Category,
    val currentPlace: Place,
    val currentScreen: MyCityScreen
)
