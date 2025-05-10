package com.uglyeagle.controller;

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/home")
class HomeController {

    @GetMapping
    fun home(): String {
        val list = mutableListOf<String>() // Idiomatic Kotlin style function
        list.add("/home endpoint accessed successfully")
        println(list[0]) // Kotlin style indexing and print function

        return "Welcome to the Home Controller!"
    }
}