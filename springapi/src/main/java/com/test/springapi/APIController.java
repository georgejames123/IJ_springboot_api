
package com.test.springapi;

import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/api")
public class APIController {

    @GetMapping("/hello")
    public String hello() {
        System.out.println("Hello from Spring Boot!  " + new Date().toString());
        return "Hello from Spring Boot!  " + new Date().toString();
    }

    @PostMapping("/echo")
    public String echo(@RequestBody String message) {
        System.out.println("Echo: " + message);
        return "Echo: " + message;
    }

    @GetMapping("/time")
    public String time() {
        System.out.println("Time : " + new Date().toString());
        return "Time : " + new Date().toString();
    }
}