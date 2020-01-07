package com.learning.hzero.gateway;

import org.hzero.autoconfigure.gateway.EnableHZeroGateway;
import org.hzero.gateway.GatewayApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableHZeroGateway
@EnableDiscoveryClient
public class LearningHzeroGatewayApplication {

    public static void main(String[] args) {
        //SpringApplication.run(LearningHzeroGatewayApplication.class, args);
        try {
            new SpringApplicationBuilder(GatewayApplication.class)
                    .web(WebApplicationType.REACTIVE)
                    .run(args);
        }catch (Throwable e){
            e.printStackTrace();
        }
    }

}
