package com.learning.microservice.cartdataservice.service;

import com.learning.microservice.cartdataservice.model.UserCart;

public interface UserCartService {
	public UserCart getUserCart(String userId);
}
