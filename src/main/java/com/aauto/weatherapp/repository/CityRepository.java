package com.aauto.weatherapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aauto.weatherapp.model.City;

public interface CityRepository extends JpaRepository<City, Long>{

}