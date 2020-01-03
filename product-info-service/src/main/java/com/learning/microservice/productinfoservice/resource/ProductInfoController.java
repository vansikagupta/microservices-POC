package com.learning.microservice.productinfoservice.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.microservice.productinfoservice.model.Product;

@RestController
@RequestMapping("/product")
public class ProductInfoController {

	@RequestMapping("/{productId}")
	public Product getProduct(@PathVariable("productId") String productId)
	{
		return new Product(productId,"New Product","desc for"+productId,2400);
	}
}
