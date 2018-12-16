package com.server.omwnta

import com.server.omwnta.domain.Message
import com.server.omwnta.repository.MessageRepository
import junit.framework.TestCase.assertNotNull
import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired


class OmwntaApplicationTests : TestBase() {

	@Autowired
	lateinit var messageRepository: MessageRepository

	@Test
	fun contextLoads() {
		var message = Message("", "",0.0, 0.0, -1)
		message = messageRepository.save(message)

		assertNotNull(message)
	}

}
