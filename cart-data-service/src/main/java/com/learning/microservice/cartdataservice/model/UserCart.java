package com.learning.microservice.cartdataservice.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserCart {
	@Id
	private String userId;
	@ElementCollection
	@Column(name="CartDetails")
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
	
	public void addToCart(CartProduct product)
	{
		this.cart.add(product);
	}
	
	public CartProduct getCartProduct(String productId)
	{
		return this.cart.stream()
				.filter(product -> product.getProductId().equals(productId))
				.findFirst()
				.orElse(null);
	}
}
