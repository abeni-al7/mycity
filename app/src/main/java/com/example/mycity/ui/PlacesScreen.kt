package com.example.mycity.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycity.data.Place
import com.example.mycity.data.Restaurants

@Composable
fun PlacesScreen(
    places: List<Place>,
    onPlaceClick: (Place) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(places) { place ->
            PlaceCard(
                place = place,
                onPlaceClick = onPlaceClick
            )
        }
    }
}

@Composable
fun PlaceCard(
    place: Place,
    onPlaceClick: (Place) -> Unit
) {
    Card(
        onClick = { onPlaceClick(place) },
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            PlaceImage(
                imageResourceId = place.imageResourceId
            )
            PlaceDescription(
                title = place.title
            )
        }
    }
}

@Composable
fun PlaceImage(
    imageResourceId: Int
) {
    Image(
        painter = painterResource(imageResourceId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .width(50.dp)
            .height(50.dp)
    )
}

@Composable
fun PlaceDescription(
    title: Int
) {
    Text(
        text = stringResource(title),
        modifier = Modifier.padding(8.dp)
    )
}

@Preview
@Composable
fun PlacesScreenPreview() {
    PlacesScreen(
        places = Restaurants.allRestaurants,
        onPlaceClick = {}
    )
}