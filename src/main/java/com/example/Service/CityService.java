package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.City;
import com.example.Repository.CityRepository;

@Service
public class CityService {

	@Autowired
	private CityRepository cityRepo;
	
	public City addOrUpdate(City city)
	{
		return cityRepo.save(city);
	}
	
	public boolean deleteById(int id)
	{
		cityRepo.deleteById(id);
		return true;
	}
	
	public City getById(int id)
	{
		return cityRepo.findById(id).get();
	}
	
	public List<City> getAll()
	{
		return cityRepo.findAll();
	}
}
