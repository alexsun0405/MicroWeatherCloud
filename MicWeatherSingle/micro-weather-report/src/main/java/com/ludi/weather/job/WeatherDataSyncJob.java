package com.ludi.weather.job;

import java.util.List;

import com.ludi.weather.service.CityDataService;
import com.ludi.weather.service.WeatherDataService;
import com.ludi.weather.vo.City;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 * Weather Data Sync Job.
 * 
 * @since 1.0.0 2017年11月23日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@Component
@Slf4j
public class WeatherDataSyncJob {

    public static final long TIME_INTERNAL = 1000L;

	@Autowired
	private CityDataService cityDataService;
	
	@Autowired
	private WeatherDataService weatherDataService;

    @Scheduled(fixedRate = TIME_INTERNAL * 1800)
    protected void test() {
        log.info("=========同步城市数据开始=========");
        // 获取城市ID列表
        List<City> cityList = null;

        try {
            cityList = cityDataService.listCity();
        } catch (Exception e) {
            log. error("=========同步城市数据异常=========");
        }

        // 遍历城市ID获取天气
        for (City city : cityList) {
            String cityId = city.getCityId();
            weatherDataService.syncDateByCityId(cityId);
        }

        log.info("=========同步城市数据结束=========");
    }

}
