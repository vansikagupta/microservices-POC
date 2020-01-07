package com.learning.microservice.cartdataservice.service;

import com.learning.microservice.cartdataservice.model.CartProduct;
import com.learning.microservice.cartdataservice.model.UserCart;

public interface UserCartService {
	
	public UserCart getUserCart(String userId);

	public void updateCartProduct(CartProduct product, String userId);

	public void increaseCountCartProduct(String userId, String productId);
}
