package com.zsky.sleuthm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class SleuthMApplication {

    public static void main(String[] args) {
        SpringApplication.run(SleuthMApplication.class, args);
    }

}
