
package com.test.springapi;

import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.Date;

@RestController
@RequestMapping("/api")
public class APIController {

    @GetMapping("/hello")
    public String hello() {
        System.out.println("Hello from Spring Boot!");
        System.out.println(new Date().toString());
        return "Hello from Spring Boot!";
    }
}