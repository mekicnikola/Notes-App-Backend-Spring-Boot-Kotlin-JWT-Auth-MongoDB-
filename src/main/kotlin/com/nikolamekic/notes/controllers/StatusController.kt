package com.nikolamekic.notes.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class StatusController {

    @GetMapping
    fun getStatus(): String {
        return "Everything works!"
    }
}