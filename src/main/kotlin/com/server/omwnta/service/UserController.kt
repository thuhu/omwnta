package com.server.omwnta.service

import com.server.omwnta.dto.MessageDto
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController (val userService : UserService){

    @GetMapping("/get-all-messages")
    fun getAllMessagesEndpoint() : List<MessageDto>{
        return userService.getAllMessages()
    }

    @PostMapping("/post-message")
    fun getAllMessages(@RequestBody messageDto: MessageDto) : MessageDto{
        return userService.postMessage(messageDto)
    }
}