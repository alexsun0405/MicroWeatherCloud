package com.ludi.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableDiscoveryClient
@EnableScheduling
@EnableFeignClients
public class MsaWeatherCollectionEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaWeatherCollectionEurekaApplication.class, args);
	}
}
