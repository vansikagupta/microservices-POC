package com.learning.microservice.productinfoservice.service;

import com.learning.microservice.productinfoservice.model.Product;

public interface ProductInfoService {
	public Product getProductInfo(String productId);

}
