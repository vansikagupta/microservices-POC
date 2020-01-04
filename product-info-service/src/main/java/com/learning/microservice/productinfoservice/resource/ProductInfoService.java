package com.learning.microservice.productinfoservice.resource;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.microservice.productinfoservice.model.Product;

@Service
public class ProductInfoService {
	
	@Autowired
	ProductRepo productRepo;

	public Product getProductInfo(String productId)
	{
		Product product = productRepo.findByProductId(productId).orElseThrow(IllegalArgumentException::new);
		return product;
	}
	
}
