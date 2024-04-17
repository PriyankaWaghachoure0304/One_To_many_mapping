package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.City;
import com.example.Entity.Country;
import com.example.Repository.CountryRepository;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepo;
	
	public Country addOrUpdate(Country country)
	{
		return countryRepo.save(country);
	}
	
	public boolean deleteById(int id)
	{
		countryRepo.deleteById(id);
		return true;
	}
	
	public Country getById(int id)
	{
		return countryRepo.findById(id).get();
	}
	
	public List<Country> getAll()
	{
		return countryRepo.findAll();
	}
}
