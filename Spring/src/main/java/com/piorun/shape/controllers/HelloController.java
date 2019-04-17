package com.piorun.shape.controllers;

import com.piorun.shape.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;
import java.time.LocalDate;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "RATAJ PEDALE XDDD";
    }

    @GetMapping("/user")
    public User getUser() {
        return new User(
                "Mikołaj",
                "Ratajczyk",
                "miki@rataj.com",
                LocalDate.of(1993, 1, 1));
    }
}