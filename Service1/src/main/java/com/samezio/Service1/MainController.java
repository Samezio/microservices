package com.samezio.Service1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Value("${spring.application.name}")
    private String serviceName;
    @GetMapping("/hello")
    public String hello() {
        return String.format("Hello from %s", serviceName);
    }
}
