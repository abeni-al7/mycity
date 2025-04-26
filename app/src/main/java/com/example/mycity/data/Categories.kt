package com.example.mycity.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import com.example.mycity.R

object Categories {
    val defaultCategory = Category(
        name = R.string.category_coffee,
        icon = Icons.Filled.Place
    )

    val allCategories = listOf<Category>(
        Category(
            name = R.string.category_coffee,
            icon = Icons.Filled.Place
        ),
        Category(
            name = R.string.category_restaurants,
            icon = Icons.Filled.Place
        ),
        Category(
            name = R.string.category_kids,
            icon = Icons.Filled.Place
        ),
        Category(
            name = R.string.category_parks,
            icon = Icons.Filled.Place
        ),
        Category(
            name = R.string.category_shopping_centers,
            icon = Icons.Filled.Place
        )
    )
}