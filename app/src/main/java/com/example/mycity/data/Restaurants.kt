package com.example.mycity.data

import com.example.mycity.R

object Restaurants {
    val defaultRestaurant = Place(
        imageResourceId = R.drawable.la_mandoline_restaurant,
        title = R.string.la_mandoline_restaurant,
        description = R.string.place_description
    )

    val allRestaurants = listOf<Place>(
        Place(
            imageResourceId = R.drawable.la_mandoline_restaurant,
            title = R.string.la_mandoline_restaurant,
            description = R.string.place_description
        ),
        Place(
            imageResourceId = R.drawable.om_indian_restaurant,
            title = R.string.om_indian_restaurant,
            description = R.string.place_description
        ),
        Place(
            imageResourceId = R.drawable.sishu_restaurant,
            title = R.string.sishu_restaurant,
            description = R.string.place_description
        ),
        Place(
            imageResourceId = R.drawable.the_oriental_restaurant,
            title = R.string.the_oriental_restaurant,
            description = R.string.place_description
        ),
        Place(
            imageResourceId = R.drawable.yod_abysinnia_restaurant,
            title = R.string.yod_abysinnia_restaurant,
            description = R.string.place_description
        )
    )
}