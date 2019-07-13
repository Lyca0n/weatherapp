package com.aauto.weatherapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class City{
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String countryCode;
    
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
        
    public String getCountryCode(){
        return this.countryCode;
    }

    public void setCountryCode(String countryCode){
        this.countryCode = countryCode;
    }
}