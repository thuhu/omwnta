package com.server.omwnta.service

import com.server.omwnta.dto.MessageDto
import com.server.omwnta.repository.MessageRepository
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(val messageRepository: MessageRepository) : UserService {
    override fun getAllMessages(): List<MessageDto> {
        return messageRepository.findAll().map { message ->  message.toDto() }
    }
}