package com.diegolopmon.springbootcourse.exercices.webservices.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "hello")
public class HelloConfiguration {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloConfiguration{"
                + "name='"
                + name
                + '\''
                + '}';
    }
}
