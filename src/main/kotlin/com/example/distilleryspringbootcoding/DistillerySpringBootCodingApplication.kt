package com.example.distilleryspringbootcoding

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class DistillerySpringBootCodingApplication

fun main(args: Array<String>) {
	runApplication<DistillerySpringBootCodingApplication>(*args)
}
