package com.learning.hzero.oauth;

import org.hzero.autoconfigure.oauth.EnableHZeroOauth;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableHZeroOauth
@EnableDiscoveryClient
@SpringBootApplication
public class LearningHzeroOauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningHzeroOauthApplication.class, args);
    }

}
