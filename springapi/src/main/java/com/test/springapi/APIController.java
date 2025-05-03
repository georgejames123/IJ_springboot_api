
package com.test.springapi;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class APIController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot!";
    }
}