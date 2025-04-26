package com.example.mycity.data

import androidx.annotation.StringRes
import androidx.compose.ui.graphics.vector.ImageVector

data class Category(
    @StringRes val name: Int,
    val icon: ImageVector,
)
