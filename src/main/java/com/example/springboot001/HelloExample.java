package com.example.springboot001;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloExample {
    @RequestMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @RequestMapping("/greeting")
    public String helloAgain(@RequestParam(value = "name", defaultValue = "User") String name) {
        return "Hello " + name;
    }
}
