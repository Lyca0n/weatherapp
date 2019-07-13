package com.aauto.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Forecast{
    private List<Reading> readings;

}