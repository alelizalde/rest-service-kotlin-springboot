package popcornbyte.com

/*
author: Al Elizalde
date: June 15 2019
web site: http://popcornbyte.com
*/

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Application

//To run the application ./gradlew bootRun
fun main() {
    SpringApplication.run(Application::class.java)
}