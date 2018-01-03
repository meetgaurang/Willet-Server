package com.willetserver.willetserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.willetserver.willetserver.model.ServiceResponseObject;
import com.willetserver.willetserver.repository.ProductRepository;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
    ProductRepository productRepository;
	
	@GetMapping("/products")
	public ServiceResponseObject getAllProducts() {
		ServiceResponseObject object = new ServiceResponseObject();
		object.setMobiles(productRepository.findAll());
	    return object;
	}
}
