package com.server.omwnta.service

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/version")
class VersionController() {
    @GetMapping("/latest")
    fun serviceVersion(): String = "0.0.1";

}