package me.kalmykovsa.hellonew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HelloNewApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloNewApplication.class, args);
    }
}
