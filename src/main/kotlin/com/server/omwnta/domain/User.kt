package com.server.omwnta.domain

import com.server.omwnta.common.BaseDomainObject
import com.server.omwnta.dto.UserDTO
import org.springframework.data.annotation.Id
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType

@Entity
class User(
        @Id @GeneratedValue(strategy = GenerationType.AUTO) private val id: Long = -1,
        private val firstName: String,
        private val lastName: String,
        private val telephone: String,
        private val email: String
        ): BaseDomainObject<UserDTO>() {

    override fun toDTO(): UserDTO {
        val userDTO: UserDTO = UserDTO(id,
                firstName,
                lastName,
                telephone,
                email
        );
        return userDTO;
    }
}