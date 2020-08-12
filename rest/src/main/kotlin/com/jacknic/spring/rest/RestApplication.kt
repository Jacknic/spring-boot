package com.jacknic.spring.rest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong


data class Greeting(val id: Long, val content: String)

@RestController
@SpringBootApplication
class RestApplication {
    private val counter = AtomicLong()
    private val template = "Hello, %s!"

    @GetMapping("/greeting")
    fun greeting(@RequestParam(name = "name", defaultValue = "World") name: String): Greeting {
        return Greeting(counter.incrementAndGet(), template.format(name))
    }
}

fun main(args: Array<String>) {
    runApplication<RestApplication>(*args)
}
