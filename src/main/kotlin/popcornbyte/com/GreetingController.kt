package popcornbyte.com

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

/*
author: Al Elizalde
date: June 15 2019
web site: http://popcornbyte.com
*/

@RestController
class GreetingController {

    @Autowired
    lateinit var gfj: GreetingsFromJava

    val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) =
        Greeting(counter.incrementAndGet(), "Hello, $name")

    @GetMapping("/java_greeting")
    fun greetingJava(@RequestParam(value = "name", defaultValue = "World") name: String): Greeting {
        return gfj.greetings2(counter.incrementAndGet(), name)
    }



}