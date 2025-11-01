package com.example.teste.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/teste")
public class Controller {
    @GetMapping("/")
    public String hello() {
        return "Olá, Spring Boot!";
    }
}
