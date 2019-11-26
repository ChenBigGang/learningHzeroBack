package com.learning.hzero.iam;

import org.hzero.autoconfigure.iam.EnableHZeroIam;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableHZeroIam
@EnableDiscoveryClient
@SpringBootApplication
public class LearningHzeroIamApplication {
    public LearningHzeroIamApplication() {
    }

    public static void main(String[] args) {
        try {
            SpringApplication.run(org.hzero.iam.IamApplication.class, args);
        } catch (Throwable var2) {
            var2.printStackTrace();
        }

    }
}