package com.industriousgnomes.properties;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Slf4j
@Data
@Component
@ConfigurationProperties(prefix = "customer")
public class Customer {

    private String name;
    private List<String> street;
    private String city;
    private String state;
    private String zipCode;

    @PostConstruct
    public void postConstruct() {
        log.info("Customer Post Construct: " + this.toString());
    }

    public void setName(String name) {
        log.info("***** NAME SET = " + name + " *****");
        this.name = name;
    }
}
