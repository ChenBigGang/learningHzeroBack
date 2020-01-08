package com.learning.hzero.admin;

/**
 * @author:ganggang
 * @create:2020-01-08
 * @description:
 **/
import org.hzero.autoconfigure.admin.EnableHZeroAdmin;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableHZeroAdmin
@EnableDiscoveryClient
@SpringBootApplication
public class LearningHzeroAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(LearningHzeroAdminApplication.class, args);
    }
}



