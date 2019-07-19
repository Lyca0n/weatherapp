package com.aauto.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Reading {
    @JsonProperty("main")
    private ReadingDetail detail;

    private long dt;

    public void setReadingDetail(ReadingDetail detil) {
        this.detail = detail;
    }

    public ReadingDetail getDetail() {
        return this.detail;
    }

    public void setDt(long dt){
        this.dt = dt;
    }

    public long getDt(){
       return this.dt;
    }
}