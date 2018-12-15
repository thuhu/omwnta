package com.server.omwnta.service

import com.server.omwnta.dto.MessageDto

interface UserService {
    fun getAllMessages() : List<MessageDto>
    fun postMessage(messageDto: MessageDto) : MessageDto
}