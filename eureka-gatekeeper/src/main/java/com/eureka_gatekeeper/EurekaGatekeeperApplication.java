package com.eureka_gatekeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaGatekeeperApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaGatekeeperApplication.class, args);
	}

}
