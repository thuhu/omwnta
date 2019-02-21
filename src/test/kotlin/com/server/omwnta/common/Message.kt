package com.server.omwnta.common

import org.springframework.data.annotation.Id
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Table

@Entity
class Message(
        @Id @GeneratedValue(strategy = GenerationType.AUTO) private val id: Long = -1,
        private val simpleField: String
        ): BaseDomainObject<SimpleServiceDTO>() {
    override fun toDTO(): SimpleServiceDTO {
        return SimpleServiceDTO(id, simpleField);
    }
}