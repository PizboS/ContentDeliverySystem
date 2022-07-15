package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@PropertySource(value = "classpath:application.properties")
@EnableScheduling
@EnableJpaRepositories(value = "org.example.repository")
@EntityScan("org.example.entity")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}