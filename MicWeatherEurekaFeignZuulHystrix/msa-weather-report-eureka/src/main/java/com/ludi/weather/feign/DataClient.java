package com.ludi.weather.feign;

import com.ludi.weather.vo.City;
import com.ludi.weather.vo.WeatherResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient( name = "msa-weather-eureka-client-zuul",fallback = DataClientFallBack.class)
public interface DataClient {

    @GetMapping("/city/cities")
    List<City> listCity();

    @GetMapping("/data/weather/cityId/{cityId}")
    WeatherResponse getDataByCityId(@PathVariable("cityId") String cityId);

}
