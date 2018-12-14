package com.server.omwnta.service

import com.server.omwnta.dto.MessageDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController (val userService : UserService){

    @GetMapping("/get-all-messages")
    fun getAllMessagesEndpoint() : List<MessageDto>{
        return userService.getAllMessages()
    }
}