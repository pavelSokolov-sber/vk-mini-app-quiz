package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = "classpath:application.properties")
public class VkMiniAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(VkMiniAppApplication.class, args);
        System.out.println("Application has been started");
    }

}
