package com.learning.microservice.productinfoservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.microservice.productinfoservice.model.Product;
import com.learning.microservice.productinfoservice.service.ProductInfoService;
import com.learning.microservice.productinfoservice.service.ProductInfoServiceImpl;

@RestController
@RequestMapping("/product")
public class ProductInfoController {
	
	@Autowired
	private ProductInfoService productInfoService;

	@RequestMapping("/{productId}")
	public Product getProduct(@PathVariable("productId") String productId)
	{
		return productInfoService.getProductInfo(productId);
	}
}
