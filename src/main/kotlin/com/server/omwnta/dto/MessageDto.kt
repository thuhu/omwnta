package com.server.omwnta.dto

class MessageDto(
    var content  : String,
    var author   : String,
    val altitude: Double,
    val longitude: Double,
    var id       : Long
)