package com.example.mycity.data

import com.example.mycity.R

object Parks {
    val defaultPark = Place(
        imageResourceId = R.drawable.entoto_park,
        title = R.string.entoto_park,
        description = R.string.place_description
    )

    val allParks = listOf<Place>(
        Place(
            imageResourceId = R.drawable.entoto_park,
            title = R.string.entoto_park,
            description = R.string.place_description
        ),
        Place(
            imageResourceId = R.drawable.friendship_park,
            title = R.string.friendship_park,
            description = R.string.place_description
        )
    )
}