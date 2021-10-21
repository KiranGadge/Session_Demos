package com.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
public class DemoProductServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(DemoProductServiceApplication.class, args);
	}

}
