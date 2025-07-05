package com.devspace.recyclerview

import androidx.annotation.DrawableRes

data class Contac(
    val name: String,
    val phone: String,
    @DrawableRes val icon: Int
)
