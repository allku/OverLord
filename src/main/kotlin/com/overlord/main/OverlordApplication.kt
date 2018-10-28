package com.overlord.main

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OverlordApplication

fun main(args: Array<String>) {
    runApplication<OverlordApplication>(*args)
}
