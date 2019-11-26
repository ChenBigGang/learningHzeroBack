package com.learning.hzero.config;

import org.hzero.autoconfigure.config.EnableHZeroConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.config.ConfigServerAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableHZeroConfig
@EnableEurekaClient
@SpringBootApplication(
        exclude = {ConfigServerAutoConfiguration.class}
)
public class LearningHzeroConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningHzeroConfigApplication.class, args);
    }

}
