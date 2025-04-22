package com.example.mycity.data

import com.example.mycity.R

object CoffeePlaces {
    val defaultCoffeePlace = Place(
        imageResourceId = R.drawable.akkoo_coffee,
        title = R.string.akko_coffee,
        description = R.string.place_description
    )

    val allCoffeePlaces = listOf<Place>(
        Place(
            imageResourceId = R.drawable.akkoo_coffee,
            title = R.string.akko_coffee,
            description = R.string.place_description
        ),
        Place(
            imageResourceId = R.drawable.tomoca_cofee,
            title = R.string.tomoca_coffee,
            description = R.string.place_description
        ),
        Place(
            imageResourceId = R.drawable.gesha_village_cofee,
            title = R.string.gesha_village_coffee,
            description = R.string.place_description
        ),
        Place(
            imageResourceId = R.drawable.mamokacha_cofee,
            title = R.string.mamokacha_coffee,
            description = R.string.place_description
        ),
        Place(
            imageResourceId = R.drawable.wild_coffee,
            title = R.string.wild_coffee,
            description = R.string.place_description
        )
    )
}