package com.ludi.weather.service;

import com.ludi.weather.feign.DataClient;
import com.ludi.weather.vo.Weather;
import com.ludi.weather.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Weather Report Service.
 * 
 * @since 1.0.0 2017年11月24日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {

    @Autowired
    private DataClient dataClient;

	@Override
	public Weather getDataByCityId(String cityId) {
	    //todo 由天气数据 API 微服务来提供
        WeatherResponse resp = dataClient.getDataByCityId(cityId);
        Weather data = null;
        if (resp != null) {
            data = resp.getData();
        }
        return data;
	}

}
