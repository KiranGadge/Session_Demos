package com.product.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.product.model.Product;

@Service
public class ProductServiceImpl implements ProductService{
//1-sonny
	//2-samsung
	//3-apple
	
	List<Product> slist=Arrays.asList(new Product(1,"Mobile",20000,2),
									  (new Product(2,"Mobile",200000,3)),
				                	(new Product(3,"Mobile",20000,1)),
				                			(new Product(4,"TV",20000,1)),
				                					(new Product(5,"TV",20000,2)));
	@Override
	public List<Product> getProdByid(int id) {
		
		List<Product> al = new ArrayList<>();
		
		for(Product pp:slist)
		{
			if(pp.getBrandid()==id)
				al.add(pp);
		}
		return al;
	}

}
