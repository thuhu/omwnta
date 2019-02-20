package com.server.omwnta.service

import com.server.omwnta.TestBase
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.web.client.TestRestTemplate

class UserControllerTest : TestBase() {
    @Autowired
    lateinit var testRestTemplate: TestRestTemplate

    @Test
    fun getAllMessagesWillReturnAllMessages () {
        val result = testRestTemplate.getForEntity("/user/get-all-messages", String::class.java)

        assertNotNull(result)
    }
}