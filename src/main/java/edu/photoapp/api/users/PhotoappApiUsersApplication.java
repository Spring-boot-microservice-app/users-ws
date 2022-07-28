package edu.photoapp.api.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PhotoappApiUsersApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoappApiUsersApplication.class, args);
    }

}
