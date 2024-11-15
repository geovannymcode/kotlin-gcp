package com.geovannycode

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinGcpApplication

fun main(args: Array<String>) {
	runApplication<KotlinGcpApplication>(*args)
}
