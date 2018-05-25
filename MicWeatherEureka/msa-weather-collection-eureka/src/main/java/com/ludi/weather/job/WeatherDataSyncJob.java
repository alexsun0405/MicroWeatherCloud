package com.ludi.weather.job;

import java.util.ArrayList;
import java.util.List;

import com.ludi.weather.service.WeatherDataCollectionService;
import com.ludi.weather.vo.City;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class WeatherDataSyncJob {

    public static final long TIME_INTERNAL = 1000L;


	@Autowired
	private WeatherDataCollectionService weatherDataCollectionService;

    @Scheduled(fixedRate = TIME_INTERNAL * 1800)
    protected void test() {
        log.info("=========同步城市数据开始=========");
        // 获取城市ID列表 , todo 改为由城市数据 API 微服务提供数据
        List<City> cityList = new ArrayList<>();
        City city1 = new City();
        city1.setCityId("101280601");
        cityList.add(city1);
        // 遍历城市ID获取天气
        for (City city : cityList) {
            String cityId = city.getCityId();
            weatherDataCollectionService.syncDataByCityId(cityId);
        }

        log.info("=========同步城市数据结束=========");
    }

}
