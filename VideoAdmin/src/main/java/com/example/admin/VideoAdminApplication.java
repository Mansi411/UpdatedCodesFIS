package com.example.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(value="com.example.admin.service")
@EnableEurekaClient
@SpringBootApplication
public class VideoAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoAdminApplication.class, args);
	}

}
