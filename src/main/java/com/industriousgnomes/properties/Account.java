package com.industriousgnomes.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Map;

@Slf4j
@Data
@Component
@ConfigurationProperties(prefix = "account")
@AllArgsConstructor
public class Account {

    private Map<String, Map<String, Object>> accountMapping;

    @PostConstruct
    public void postConstruct() {
        log.info("Account PostConstruct: " + accountMapping.toString());
    }
}
