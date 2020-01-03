package com.learning.microservice.cartdataservice.model;

import java.util.List;

public class UserCart {
	private String userId;
	private List<CartProduct> cart;
	
	public UserCart() {}
	
	public UserCart(String userId, List<CartProduct> cart) {
		super();
		this.userId = userId;
		this.cart = cart;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<CartProduct> getCart() {
		return cart;
	}

	public void setCart(List<CartProduct> cart) {
		this.cart = cart;
	}
	
	
}
