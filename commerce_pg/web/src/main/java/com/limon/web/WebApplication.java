package com.limon.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(
        scanBasePackages = "com.limon.web.config"
)
public class WebApplication {

    public static void main(String[] args) {
        System.out.println("penguin");
        SpringApplication.run(WebApplication.class, args);
    }

}
