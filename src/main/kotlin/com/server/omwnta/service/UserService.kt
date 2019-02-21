package com.server.omwnta.service

import com.server.omwnta.common.Service
import com.server.omwnta.domain.Message
import com.server.omwnta.dto.MessageDto

interface UserService: Service<Message, MessageDto> {
    fun getAllMessages() : List<MessageDto>
    fun postMessage(messageDto: MessageDto) : MessageDto
}