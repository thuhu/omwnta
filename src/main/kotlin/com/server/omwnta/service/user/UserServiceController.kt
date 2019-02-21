package com.server.omwnta.service.user

import com.server.omwnta.dto.UserDTO
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserServiceController(userService : UserService) {

    @PostMapping("/create")
    fun create(userDTO: UserDTO) {

    }
}