package com.aauto.weatherapp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.aauto.weatherapp.model.Forecast;

@Service
public class ForecastService {

  @Value("${forecast.api.key}")
  private String key;

  @Value("${forecast.api.url}")
  private String url;

  @Cacheable("forecast")
  public Forecast getForecast(String query) {
    String apiq = "?q=" + query;
    RestTemplate restTemplate = new RestTemplate();
    // Forecast fr = restTemplate.getForObject(this.url + apiq + "&APPID=" +
    // this.key, Forecast.class);
    // test endpoint
    Forecast fr = restTemplate.getForObject("http://localhost:3000/forecasts/0", Forecast.class);
    return fr;
  }
}