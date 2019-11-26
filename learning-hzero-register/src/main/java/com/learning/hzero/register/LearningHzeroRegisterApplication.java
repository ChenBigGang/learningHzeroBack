package com.learning.hzero.register;

import org.hzero.autoconfigure.register.EnableHZeroRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.eureka.server.EurekaServerAutoConfiguration;
import org.springframework.context.annotation.Import;

@EnableHZeroRegister
@EnableEurekaServer
@SpringBootApplication
@Import({EurekaServerAutoConfiguration.class})
public class LearningHzeroRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningHzeroRegisterApplication.class, args);
    }

}
