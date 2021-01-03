package com.guru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaLoadbalancerProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaLoadbalancerProductApplication.class, args);
	}

}
