package com.example.mycity.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.mycity.R
import com.example.mycity.data.Categories
import com.example.mycity.data.Category
import com.example.mycity.data.CoffeePlaces
import com.example.mycity.data.KidsPlaces
import com.example.mycity.data.Parks
import com.example.mycity.data.Place
import com.example.mycity.data.Restaurants
import com.example.mycity.data.ShoppingCenters
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class MyCityViewModel: ViewModel() {
    private var _uiState = MutableStateFlow(MyCityUiState())
    val uiState: StateFlow<MyCityUiState> = _uiState

    init {
        _uiState.update {
            it.copy(
                categories = Categories.allCategories,
                places = CoffeePlaces.allCoffeePlaces,
                currentCategory = Categories.defaultCategory,
                currentPlace = CoffeePlaces.defaultCoffeePlace
            )
        }
    }

    private fun getPlacesByCategory(category: Category): List<Place> {
        return when (category.name) {
            R.string.category_coffee -> CoffeePlaces.allCoffeePlaces
            R.string.category_restaurants -> Restaurants.allRestaurants
            R.string.category_kids -> KidsPlaces.allKidsPlaces
            R.string.category_parks -> Parks.allParks
            R.string.category_shopping_centers -> ShoppingCenters.allShoppingCenters
            else -> CoffeePlaces.allCoffeePlaces

        }
    }

    fun updateCurrentCategory(selectedCategory: Category) {
        _uiState.update {
            it.copy(
                currentCategory = selectedCategory,
                places = getPlacesByCategory(selectedCategory),
            )
        }
    }

    fun updateCurrentPlace(selectedPlace: Place) {
        _uiState.update {
            it.copy(
                currentPlace = selectedPlace
            )
        }
    }
}