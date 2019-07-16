package com.aauto.weatherapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.aauto.weatherapp.model.Forecast;
import com.aauto.weatherapp.service.ForecastService;

@RestController
public class TestController {
    @Autowired
    private ForecastService serv;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Forecast list(@RequestParam String city) {
        return this.serv.getForecast(city);
    }
}