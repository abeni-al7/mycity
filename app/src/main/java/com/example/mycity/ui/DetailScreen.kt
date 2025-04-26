package com.example.mycity.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycity.data.Place
import com.example.mycity.data.Restaurants

@Composable
fun DetailScreen(
    place: Place
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .scrollable(
                state = rememberScrollState(),
                enabled = true,
                orientation = Orientation.Vertical
            )
    ) {
        Image(
            painter = painterResource(place.imageResourceId),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(10f / 10f)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = stringResource(place.title),
            fontSize = 36.sp,
            modifier = Modifier
                .padding(8.dp)
        )
        Text(
            text = stringResource(place.description),
            modifier = Modifier
                .padding(8.dp)
        )
    }
}

@Preview
@Composable
fun DetailScreenPreview() {
    DetailScreen(
        place = Restaurants.defaultRestaurant
    )
}