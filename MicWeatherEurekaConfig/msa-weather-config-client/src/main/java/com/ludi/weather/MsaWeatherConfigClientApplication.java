package com.ludi.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsaWeatherConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaWeatherConfigClientApplication.class, args);
	}
}
