package com.ashifs.cloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//https://www.baeldung.com/spring-cloud-bootstrappingx
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class CloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigApplication.class, args);
	}

}
