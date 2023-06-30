package com.example.clapingo.json_data_class

data class booking_data(
val bookedTimings: BookedTimings,
val isBlocked: Boolean,
val rating: Double,
val statusCode: Int,
val teacher: Teacher,
val timeslot: Timeslot
)

