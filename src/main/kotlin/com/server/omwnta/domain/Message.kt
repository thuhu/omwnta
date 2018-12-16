package com.server.omwnta.domain

import com.server.omwnta.dto.MessageDto
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType

@Entity
class Message (
        private val content: String,
        private val author: String,
        private val altitude: Double,
        private val longitude: Double,
        @Id @GeneratedValue(strategy = GenerationType.AUTO) private val id: Long = -1)
{
    constructor(messageDto : MessageDto)
            : this(messageDto.content,
            messageDto.author,
            messageDto.altitude,
            messageDto.longitude,
            messageDto.id
    )

    fun toDto() : MessageDto {

        return MessageDto(content, author, altitude, longitude, id)
    }
}