package com.myphotoshop.fotoapp.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FotoAppDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FotoAppDiscoveryServiceApplication.class, args);
	}

}
