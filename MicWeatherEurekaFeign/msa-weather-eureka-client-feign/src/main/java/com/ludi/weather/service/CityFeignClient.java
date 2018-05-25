package com.ludi.weather.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("msa-weather-city-eureka")
public interface CityFeignClient {

    @GetMapping("/cities")
    String listCity();

}
