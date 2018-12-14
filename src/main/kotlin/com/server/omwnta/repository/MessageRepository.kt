package com.server.omwnta.repository

import com.server.omwnta.domain.Message
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MessageRepository : CrudRepository<Message, Long>, JpaSpecificationExecutor<Message>