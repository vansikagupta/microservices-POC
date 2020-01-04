package com.learning.microservice.cartdataservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.microservice.cartdataservice.model.UserCart;
import com.learning.microservice.cartdataservice.model.CartProduct;

@RestController
@RequestMapping("/cart")
public class UserCartController {
	
	@Autowired
	UserCartService userCartService;
	
	@RequestMapping("/{userId}")
	public UserCart getUserCart(@PathVariable("userId") String userId)
	{
		return userCartService.getUserCart(userId);
	}
}
