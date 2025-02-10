package com.example.cloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class NewController {
    @GetMapping
    public String hello() {
        return "Hello is this Venkatesh!";
    }
}
