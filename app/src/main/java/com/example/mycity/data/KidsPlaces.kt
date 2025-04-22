package com.example.mycity.data

import com.example.mycity.R

object KidsPlaces {
    val defaultKidsPlace = Place(
        imageResourceId = R.drawable.lion_park_kids,
        title = R.string.lion_park_kids,
        description = R.string.place_description
    )

    val allKidsPlaces = listOf<Place>(
        Place(
            imageResourceId = R.drawable.lion_park_kids,
            title = R.string.lion_park_kids,
            description = R.string.place_description
        ),
        Place(
            imageResourceId = R.drawable.sheger_park_kids,
            title = R.string.sheger_park_kids,
            description = R.string.place_description
        ),
        Place(
            imageResourceId = R.drawable.unity_park_kids,
            title = R.string.unity_park_kids,
            description = R.string.place_description
        )
    )
}