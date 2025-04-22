package com.example.mycity.data

import com.example.mycity.R

object ShoppingCenters {
    val defaultShoppingCenter = Place(
        imageResourceId = R.drawable.lafto_mall_shopping_center,
        title = R.string.lafto_mall_shopping_center,
        description = R.string.place_description
    )

    val allShoppingCenters = listOf<Place>(
        Place(
            imageResourceId = R.drawable.lafto_mall_shopping_center,
            title = R.string.lafto_mall_shopping_center,
            description = R.string.place_description
        ),
        Place(
            imageResourceId = R.drawable.mafi_shopping_center,
            title = R.string.mafi_shopping_center,
            description = R.string.place_description
        ),
        Place(
            imageResourceId = R.drawable.morning_star_mall_shopping_center,
            title = R.string.morning_star_mall_shopping_center,
            description = R.string.place_description
        )
    )
}