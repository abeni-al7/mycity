package com.example.mycity.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycity.data.Categories
import com.example.mycity.data.Category
import com.example.mycity.ui.theme.MyCityTheme


@Composable
fun CategoriesScreen(
    categories: List<Category>
) {
    LazyColumn {
        items(categories) { category ->
            CategoryCard(category)
        }
    }
}

@Composable
fun CategoryCard(
    category: Category
) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.padding(8.dp)
        ) {
            Icon(
                imageVector = category.icon,
                contentDescription = null
            )
            Text(
                text = stringResource(category.name)
            )
        }
    }
}

@Preview
@Composable
fun CategoriesScreenPreview() {
    MyCityTheme {
        CategoriesScreen(
            categories = Categories.allCategories
        )
    }
}