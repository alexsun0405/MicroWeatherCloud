package com.ludi.weather.controller;

import com.ludi.weather.feign.DataClient;
import com.ludi.weather.service.WeatherReportService;
import com.ludi.weather.vo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Weather Report Controller.
 * 
 * @since 1.0.0 2017年11月24日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@RestController
@RequestMapping("/report")
public class WeatherReportController {

	@Autowired
	private WeatherReportService weatherReportService;
    @Autowired
    private DataClient dataClient;
	
	@GetMapping("/cityId/{cityId}")
	public ModelAndView getReportByCityId(@PathVariable("cityId") String cityId, Model model) {
		model.addAttribute("title", "老卫的天气预报");
		model.addAttribute("cityId", cityId);
		//TODO 由城市列表 API 微服务提供数据
        List<City> cityList = dataClient.listCity();
		model.addAttribute("cityList", cityList);
		model.addAttribute("report", weatherReportService.getDataByCityId(cityId));
		return new ModelAndView("weather/report", "reportModel", model);
	}

}
