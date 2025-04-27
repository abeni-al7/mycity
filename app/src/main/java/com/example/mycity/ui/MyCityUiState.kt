package com.example.mycity.ui

import com.example.mycity.data.Category
import com.example.mycity.data.Place

data class MyCityUiState(
    val categories: List<Category> = emptyList(),
    val places: List<Place> = emptyList(),
    val currentCategory: Category? = null,
    val currentPlace: Place? = null
)
