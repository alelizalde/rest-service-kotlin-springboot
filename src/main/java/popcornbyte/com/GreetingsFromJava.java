package popcornbyte.com;

/*
author: Al Elizalde
date: June 15 2019
web site: http://popcornbyte.com
*/

import org.springframework.stereotype.Service;

@Service
public class GreetingsFromJava {
    public Greeting greetings2(Long i, String name){
        return new Greeting(i, "Hello from java: " + name);
    }
}
