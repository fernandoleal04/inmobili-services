package com.micro.properties.micro_properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroPropertiesApplication.class, args);
	}

}
