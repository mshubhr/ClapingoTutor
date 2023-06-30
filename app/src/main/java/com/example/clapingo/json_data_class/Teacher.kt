package com.example.clapingo.json_data_class

data class Teacher(
    val _id: String,
    val description: String,
    val image: String,
    val isYoutubeConsentSigned: Boolean,
    val name: String
)