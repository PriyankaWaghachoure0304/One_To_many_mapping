package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.City;



@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

}
