package com.aauto.weatherapp.service;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import java.io.IOException;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import static org.assertj.core.api.Assertions.assertThat;
import com.aauto.weatherapp.model.Forecast;
import com.aauto.weatherapp.service.ForecastService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ForecastServiceTest{

  @Autowired
  private ForecastService forecastService;

  @Test
  public void testGetForecast() throws IOException{
    String test = "chihuahua,MX";
    Forecast fr = forecastService.getForecast(test);
    assertThat(fr).isNotNull();    
  }
  
}