package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.City;
import com.example.Entity.Country;
import com.example.Service.CityService;
import com.example.Service.CountryService;

@RestController
@RequestMapping("/country")
public class CountryController {
	@Autowired
	private CountryService countryService;
	
	@GetMapping
	private List<Country> getAll()
	{
		return countryService.getAll();
		}
	@GetMapping("/{id}")
	private Country getById(@PathVariable int id)
	{
		return countryService.getById(id);
	}
	
	@PostMapping
	private Country add(@RequestBody Country country)
	{
		return countryService.addOrUpdate(country);
	}
	
	@PutMapping("/{id}")
	private Country update(@PathVariable int id,@RequestBody Country country)
	{
		country.setCountry_id(id);
		return countryService.addOrUpdate(country);
	}
	
	@DeleteMapping("/{id}")
	private void delete(@PathVariable int id)
	{
		countryService.deleteById(id);
	}
}
