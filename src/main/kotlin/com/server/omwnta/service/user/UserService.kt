package com.server.omwnta.service.user

import com.server.omwnta.dto.UserDTO

interface UserService {
    fun create(userDTO: UserDTO): UserDTO
}