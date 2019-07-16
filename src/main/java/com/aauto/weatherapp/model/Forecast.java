package com.aauto.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {
    @JsonProperty("list")
    private List<Reading> readings;

    public void setReadings(List<Reading> readings) {
        this.readings = readings;
    }

    public List<Reading> getReadings() {
        return this.readings;
    }

}