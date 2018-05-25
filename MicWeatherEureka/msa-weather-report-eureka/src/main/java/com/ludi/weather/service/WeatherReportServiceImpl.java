package com.ludi.weather.service;

import com.ludi.weather.vo.Forecast;
import com.ludi.weather.vo.Weather;
import com.ludi.weather.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * Weather Report Service.
 * 
 * @since 1.0.0 2017年11月24日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {


	@Override
	public Weather getDataByCityId(String cityId) {
	    //todo 由天气数据 API 微服务来提供
		WeatherResponse resp =  new WeatherResponse();
        Weather data = new Weather();
        data.setAqi("81");
        data.setCity("深圳");
        data.setGanmao("容易感冒");
        data.setWendu("22");

        List<Forecast> forecasts = new ArrayList<>();
        Forecast f1 = new Forecast();
        f1.setDate("29日星期天");
        f1.setType("晴");
        f1.setFengxiang("无风");
        f1.setHigh("11");
        f1.setLow("1");

        Forecast f2 = new Forecast();
        f2.setDate("29日星期天");
        f2.setType("晴");
        f2.setFengxiang("无风");
        f2.setHigh("11");
        f2.setLow("1");

        Forecast f3 = new Forecast();
        f3.setDate("29日星期天");
        f3.setType("晴");
        f3.setFengxiang("无风");
        f3.setHigh("11");
        f3.setLow("1");

        Forecast f4 = new Forecast();
        f4.setDate("29日星期天");
        f4.setType("晴");
        f4.setFengxiang("无风");
        f4.setHigh("11");
        f4.setLow("1");

        Forecast f5 = new Forecast();
        f5.setDate("29日星期天");
        f5.setType("晴");
        f5.setFengxiang("无风");
        f5.setHigh("11");
        f5.setLow("1");
        forecasts.add(f1);
        forecasts.add(f2);
        forecasts.add(f3);
        forecasts.add(f4);
        forecasts.add(f5);

        data.setForecast(forecasts);

        resp.setData(data);

		return resp.getData();
	}

}
