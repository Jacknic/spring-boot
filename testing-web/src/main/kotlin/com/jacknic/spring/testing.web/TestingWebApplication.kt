package com.jacknic.spring.testing.web

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
@SpringBootApplication
class TestingWebApplication {
    private val template = "Hello, %s!"

    @GetMapping("/")
    fun greeting(@RequestParam(name = "name", defaultValue = "World") name: String): String {
        return template.format(name)
    }
}

fun main(args: Array<String>) {
    runApplication<TestingWebApplication>(*args)
}
