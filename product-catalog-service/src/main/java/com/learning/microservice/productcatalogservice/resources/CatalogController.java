package com.learning.microservice.productcatalogservice.resources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.learning.microservice.productcatalogservice.model.Cart;
import com.learning.microservice.productcatalogservice.model.CatalogItem;
import com.learning.microservice.productcatalogservice.model.UserCart;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/catalog")
public class CatalogController {
	
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId)
	{
		//1. for userId, get list of product ids from cart-data-microservice
		//2. for all product ids, get product details from product-info-microservice | Product => CatalogItem
		//3. put everything together		
		
		 UserCart shoppingCart = restTemplate.getForObject("http://Cart-Data-Service/cart/"+userId, UserCart.class);
		 return shoppingCart.getCart().stream().map(cart -> {
			 CatalogItem product = restTemplate.getForObject("http://ProductInfoService/product/"+cart.getProductId(), CatalogItem.class);
			 product.setCount(cart.getCount());
			 return product;	 
		 })
		 .collect(Collectors.toList());		 		
	}
}
