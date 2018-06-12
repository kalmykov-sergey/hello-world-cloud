package me.kalmykovsa.eurekastable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaStableApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaStableApplication.class, args);
    }
}
