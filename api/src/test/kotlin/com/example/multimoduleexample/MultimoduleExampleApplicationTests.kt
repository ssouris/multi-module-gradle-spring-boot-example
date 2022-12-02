package com.example.multimoduleexample

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class MultimoduleExampleApplicationTests {

	@Autowired
	lateinit var myService: MyService

	@Test
	fun contextLoads() {
		Assertions.assertEquals(myService.getFoo(), "bar")
	}

}
