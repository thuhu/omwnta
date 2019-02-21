package com.server.omwnta.common

import com.server.omwnta.TestBase
import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired

class BaseServiceTest: TestBase() {

    @Autowired
    lateinit var simpleService: SimpleService;
    @Test
    fun createWillCreateNewDomainObjectAndReturnDTO() {
        val message: Message =  Message(0, "test-field");
        simpleService.create(message);
    }
}