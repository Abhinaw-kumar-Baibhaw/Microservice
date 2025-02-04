package com.example.MicroConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroConfigServerApplication.class, args);
	}

}
