package com.nikolamekic.notes.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class StatusController {
    fun getStatus(): String {
        return "Everything works!"
    }
}