package com.server.omwnta.service

import com.server.omwnta.domain.Message
import com.server.omwnta.dto.MessageDto
import com.server.omwnta.repository.MessageRepository
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(val messageRepository: MessageRepository) : UserService {
    override fun postMessage(messageDto: MessageDto): MessageDto {
        var message = Message(messageDto)
        return messageRepository.save(message).toDto()
    }

    override fun getAllMessages(): List<MessageDto> {
        return messageRepository.findAll().map { message ->  message.toDto() }
    }
}