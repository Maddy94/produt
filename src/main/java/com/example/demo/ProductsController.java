package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Repository

public class ProductsController {
	@Autowired
	ProductsRepostory proRepo;

	@PostMapping(value = "/add")
	public String addDetails(@RequestBody Products p) {
		proRepo.save(p);
		return "Successfully Saved";
	}

	@GetMapping(value = "/getId/{id}")
	public Products getId(@PathVariable int id) {
		return proRepo.findById(id).get();
	}

	@PostMapping(value = "/addAll")
	public String addAll(@RequestBody List<Products> li) {
		proRepo.saveAll(li);
		return "Successfully Saved All Details";

	}

	@GetMapping(value = "/getAll")
	public List<Products> getAll() {
		proRepo.findAll();
		return proRepo.findAll();
	}
}
