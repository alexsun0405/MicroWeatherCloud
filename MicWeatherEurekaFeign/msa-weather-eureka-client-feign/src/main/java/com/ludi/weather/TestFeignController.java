package com.ludi.weather;

import com.ludi.weather.service.CityFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestFeignController {

    @Autowired
    private CityFeignClient cityFeignClient;

    @GetMapping("/cities")
    public String listCity() {
        return cityFeignClient.listCity();
    }

}
