package com.example.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic (
    @StringRes val stringResourceID: Int,
    val numCourses: Int,
    @DrawableRes val imageResourceID: Int
)

