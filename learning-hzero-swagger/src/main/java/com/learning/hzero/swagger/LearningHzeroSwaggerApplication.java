
package com.learning.hzero.swagger;

import org.hzero.autoconfigure.swagger.EnableHZeroSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableHZeroSwagger
@EnableDiscoveryClient
@SpringBootApplication
public class LearningHzeroSwaggerApplication {
    public LearningHzeroSwaggerApplication() {
    }

    public static void main(String[] args) {
        SpringApplication.run(LearningHzeroSwaggerApplication.class, args);
    }
}
