package com.ludi.weather.feign;

import com.ludi.weather.vo.City;
import com.ludi.weather.vo.WeatherResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataClientFallBack implements DataClient {

    @Override
    public List<City> listCity() {
        List<City> cities = new ArrayList<>();
        City city = new City();
        city.setCityId("101280601");
        city.setCityName("深圳");
        cities.add(city);

        city = new City();
        city.setCityId("101280301");
        city.setCityName("惠州");
        cities.add(city);

        return cities;
    }

    @Override
    public WeatherResponse getDataByCityId(String cityId) {
        return null;
    }
}
