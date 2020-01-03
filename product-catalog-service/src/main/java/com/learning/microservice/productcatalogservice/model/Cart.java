package com.learning.microservice.productcatalogservice.model;

public class Cart {
	private String productId;
	private int count;
	
	public Cart() {}
	
	public Cart(String productId, int count) {
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
