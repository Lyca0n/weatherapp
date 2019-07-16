package com.aauto.weatherapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.aauto.weatherapp.model.Forecast;

@RestController
public class TestController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Forecast list() {
        RestTemplate restTemplate = new RestTemplate();
        // Forecast fr =
        // restTemplate.getForObject("http://api.openweathermap.org/data/2.5/forecast?q=chihuahua,mx&APPID=ed790a8f54040c663f2ee42d053c27bd",Forecast.class);
        Forecast fr = restTemplate.getForObject("http://localhost:3000/forecasts/0", Forecast.class);
        System.out.println(fr);
        return fr;
    }
}