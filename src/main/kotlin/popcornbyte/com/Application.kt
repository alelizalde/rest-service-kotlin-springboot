package popcornbyte.com

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Application

//To run the application ./gradlew bootRun
fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}