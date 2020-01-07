package com.learning.microservice.cartdataservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.microservice.cartdataservice.model.CartProduct;
import com.learning.microservice.cartdataservice.model.UserCart;
import com.learning.microservice.cartdataservice.repository.UserCartRepo;

@Service
public class UserCartServiceImpl implements UserCartService {
	
	@Autowired
	private UserCartRepo userCartRepo;
	
	public UserCart getUserCart(String userId) {
		return userCartRepo.findById(userId).orElseThrow(IllegalArgumentException::new);
	}
	
	public void updateCartProduct(CartProduct product, String userId) {
		UserCart userCart = userCartRepo.findById(userId).orElseThrow(IllegalArgumentException::new);
		userCart.addToCart(product);
		userCartRepo.save(userCart);
	}
	
	public void increaseCountCartProduct(String userId, String productId) {
		UserCart userCart = userCartRepo.findById(userId).orElseThrow(IllegalArgumentException::new);
		CartProduct product = userCart.getCartProduct(productId);
		product.setCount(product.getCount() + 1);
		userCartRepo.save(userCart);
	}
}
