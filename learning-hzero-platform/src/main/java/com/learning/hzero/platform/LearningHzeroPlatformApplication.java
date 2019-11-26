
package com.learning.hzero.platform;

import org.hzero.autoconfigure.platform.EnableHZeroPlatform;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableHZeroPlatform
@EnableDiscoveryClient
@SpringBootApplication
public class LearningHzeroPlatformApplication {
    public LearningHzeroPlatformApplication() {
    }

    public static void main(String[] args) {
        SpringApplication.run(LearningHzeroPlatformApplication.class, args);
    }
}
