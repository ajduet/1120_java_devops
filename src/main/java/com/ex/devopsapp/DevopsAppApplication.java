package com.ex.devopsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class DevopsAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevopsAppApplication.class, args);
    }

    @GetMapping("/hi")
    public String sayHi() {
        return "hi";
    }

    @GetMapping("/empty")
    public List getEmptyList() {
        return Collections.singletonList(null);
    }

    // this time it will work

}
