package com.fss.canting.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/home")
class HomeController {
    @GetMapping("/index")
    fun index(): Any {
        val map = HashMap<String, Any>()
        map["name"] = "John"
        map["age"] = 30
        map["city"] = "New York"
        return map
    }
}
