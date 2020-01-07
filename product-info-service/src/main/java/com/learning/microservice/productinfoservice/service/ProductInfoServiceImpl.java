package com.learning.microservice.productinfoservice.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.microservice.productinfoservice.model.Product;
import com.learning.microservice.productinfoservice.repository.ProductRepo;

@Service
public class ProductInfoServiceImpl implements ProductInfoService {
	
	@Autowired
	ProductRepo productRepo;

	public Product getProductInfo(String productId)
	{
		Product product = productRepo.findByProductId(productId).orElseThrow(IllegalArgumentException::new);
		return product;
	}
	
}
