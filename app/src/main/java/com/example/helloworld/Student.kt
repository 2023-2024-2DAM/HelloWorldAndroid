package com.example.helloworld

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Student(
    val name: String,
    val surname: String,
    val age: Int
) : Parcelable
