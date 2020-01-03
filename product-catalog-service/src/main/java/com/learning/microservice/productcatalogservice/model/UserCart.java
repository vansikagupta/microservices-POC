package com.learning.microservice.productcatalogservice.model;

import java.util.List;

public class UserCart {
	private String userId;
	private List<Cart> cart;
	
	public UserCart() {}
	
	public UserCart(String userId, List<Cart> cart) {
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

	public List<Cart> getCart() {
		return cart;
	}

	public void setCart(List<Cart> cart) {
		this.cart = cart;
	}
	
	
}
