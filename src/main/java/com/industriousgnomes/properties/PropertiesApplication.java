package com.industriousgnomes.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Account.class)
public class PropertiesApplication {

    public static void main(String[] args) {
        SpringApplication.run(PropertiesApplication.class, args);
    }

}
