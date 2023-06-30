package com.example.clapingo.json_data_class

data class Timeslot(
    val Friday: List<String>,
    val Monday: List<String>,
    val Saturday: List<String>,
    val Sunday: List<String>,
    val Thursday: List<String>,
    val Tuesday: List<String>,
    val Wednesday: List<Any>
)