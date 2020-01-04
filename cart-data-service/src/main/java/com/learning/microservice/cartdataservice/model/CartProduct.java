package com.learning.microservice.cartdataservice.model;

import javax.persistence.Embeddable;

@Embeddable
public class CartProduct {
	private String productId;
	private int count;
	
	public CartProduct() {}
	
	public CartProduct(String productId, int count) {
		super();
		this.productId = productId;
		this.count = count;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
