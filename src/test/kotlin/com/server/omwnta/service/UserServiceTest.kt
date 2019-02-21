package com.server.omwnta.service

import com.server.omwnta.TestBase
import com.server.omwnta.common.Service
import com.server.omwnta.domain.Message
import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired

class UserServiceTest : TestBase() {

    @Autowired
    lateinit var userService: UserService;

    @Test
    fun createWillCreateNewUser() {
        var message = Message("", "",0.0, 0.0, -1);
        var messageDto = userService.create(message);

        messageDto.author = "";
    }
}