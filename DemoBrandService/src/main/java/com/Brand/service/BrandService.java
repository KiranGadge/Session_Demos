package com.Brand.service;

import org.springframework.web.bind.annotation.PathVariable;

import com.Brand.model.Brand;

public interface BrandService {

	
	public Brand getBrand(String brandname);
}
