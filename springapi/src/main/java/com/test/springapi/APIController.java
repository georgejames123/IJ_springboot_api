
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
}