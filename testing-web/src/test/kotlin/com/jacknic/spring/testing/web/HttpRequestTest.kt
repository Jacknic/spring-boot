package com.jacknic.spring.testing.web

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.web.server.LocalServerPort


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class HttpRequestTest {

    @LocalServerPort
    private val port = 0

    @Autowired
    private lateinit var restTemplate: TestRestTemplate

    @Test
    fun greetingShouldReturnDefaultMessage() {
        val res = restTemplate.getForObject("http://localhost:$port/", String::class.java)
        Assertions.assertEquals("Hello, World!", res)
    }

    @Test
    fun greetingShouldReturnCustomMessage() {
        val name = "Jacknic"
        val res = restTemplate.getForObject("http://localhost:$port/?name=$name", String::class.java)
        Assertions.assertEquals("Hello, Jacknic!", res)
    }
}