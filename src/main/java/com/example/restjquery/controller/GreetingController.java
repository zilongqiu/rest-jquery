package com.example.restjquery.controller;

import com.example.restjquery.model.Greeting;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    @CrossOrigin(origins = "http://localhost:8082")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World", required = false) String name) {
        System.out.println("===Greeting===");
        return new Greeting(counter.incrementAndGet(), String.format("Hello, %s!", name));
    }
}
