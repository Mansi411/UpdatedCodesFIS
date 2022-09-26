package com.example.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient

@SpringBootApplication
public class VideoCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoCustomerApplication.class, args);
	}

}
