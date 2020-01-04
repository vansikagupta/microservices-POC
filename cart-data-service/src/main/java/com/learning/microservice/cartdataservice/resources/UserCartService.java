package com.learning.microservice.cartdataservice.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.microservice.cartdataservice.model.UserCart;

@Service
public class UserCartService {
	
	@Autowired
	UserCartRepo userCartRepo;

	public UserCart getUserCart(String userId) {
		return userCartRepo.findById(userId).orElseThrow(IllegalArgumentException::new);
	}

}
