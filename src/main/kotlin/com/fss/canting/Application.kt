package com.fss.canting

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.fss.dao", "com.fss.canting.controller"])
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
