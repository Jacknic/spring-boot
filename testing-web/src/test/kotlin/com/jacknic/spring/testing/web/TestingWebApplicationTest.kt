package com.jacknic.spring.testing.web

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class TestingWebApplicationTest {

    @Autowired
    private lateinit var application: TestingWebApplication

    @Test
    fun greeting() {
        val name = "Jacknic"
        val message = application.greeting(name)
        Assertions.assertEquals("Hello, Jacknic!", message)
    }
}