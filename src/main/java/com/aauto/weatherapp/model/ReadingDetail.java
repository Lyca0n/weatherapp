package com.aauto.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ReadingDetail{
    
    private double temp;

    @JsonProperty("temp_min")
    private double tempMin;

    @JsonProperty("temp_max")
    private double tempMax;
    
    private double pressure;

    @JsonProperty("sea_level")
    private double seaLevel;

    @JsonProperty("grnd_level")
    private double groundLevel;

    private double humidity;    

}