package com.server.omwnta.common

import org.springframework.data.repository.CrudRepository

class SimpleServiceImpl(
        private var simpleServiceRepository: SimpleServiceRepository<Message>
): BaseServiceImpl<Message, SimpleServiceDTO>() {

    override fun repository(): CrudRepository<Message, Long> {
        return simpleServiceRepository;
    }

}