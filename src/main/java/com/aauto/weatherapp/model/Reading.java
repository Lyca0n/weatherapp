package com.aauto.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Reading {
    @JsonProperty("main")
    private ReadingDetail detail;

    public void setReadingDetail(ReadingDetail detil) {
        this.detail = detail;
    }

    public ReadingDetail getDetail() {
        return this.detail;
    }

}