package com.server.omwnta.service

import com.server.omwnta.common.ServiceImpl
import com.server.omwnta.domain.Message
import com.server.omwnta.dto.MessageDto
import com.server.omwnta.repository.MessageRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(val messageRepository: MessageRepository) : UserService, ServiceImpl<Message, MessageDto>() {
    override fun postMessage(messageDto: MessageDto): MessageDto {
        var message = Message(messageDto)
        return messageRepository.save(message).toDTO()
    }

    override fun getAllMessages(): List<MessageDto> {
        return messageRepository.findAll().map { message ->  message.toDTO() }
    }

    override fun repository(): CrudRepository<Message, Long> {
        return messageRepository;
    }
}