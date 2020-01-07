package com.learning.microservice.cartdataservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.microservice.cartdataservice.model.UserCart;
import com.learning.microservice.cartdataservice.repository.UserCartRepo;

@Service
public class UserCartServiceImpl {
	
	@Autowired
	private UserCartRepo userCartRepo;

	public UserCart getUserCart(String userId) {
		return userCartRepo.findById(userId).orElseThrow(IllegalArgumentException::new);
	}

}
