package com.myway.rbac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RBACApplication {
    public static void main(String[] args) {
        SpringApplication.run(RBACApplication.class, args);
    }
}
