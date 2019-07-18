package com.aauto.weatherapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.aauto.weatherapp.repository.CityRepository;
import com.aauto.weatherapp.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin( maxAge = 3600)
@RestController
public class CityController{
    @Autowired
    private CityRepository cityRepository;

    @RequestMapping(value="/cities", method=RequestMethod.GET)
    public List<City> list(){        
        return cityRepository.findAll();
    }
}