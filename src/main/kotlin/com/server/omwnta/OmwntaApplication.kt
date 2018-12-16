package com.server.omwnta

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan


@SpringBootApplication
@ComponentScan("com.server.omwnta")
class OmwntaApplication

fun main(args: Array<String>) {
    runApplication<OmwntaApplication>(*args)
}
