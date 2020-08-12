package com.jacknic.spring.quickstart

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.text.SimpleDateFormat
import java.util.*

@RestController
@SpringBootApplication
class QuickstartApplication {
    private val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")

    @GetMapping("/hello")
    fun hello() = "Hello, ${sdf.format(Date())}"
}

fun main(args: Array<String>) {
    runApplication<QuickstartApplication>(*args)
}
