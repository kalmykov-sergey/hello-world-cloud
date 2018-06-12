package me.kalmykovsa.worldstable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WorldStableApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorldStableApplication.class, args);
    }
}
