package com.learning.microservice.productinfoservice.model;

public class Product {
	private String productId;
	private String name;
	private String desc;
	private double price;
	
	public Product() {}
	
	public Product(String productId, String name, String desc, double price) {
		super();
		this.productId = productId;
		this.name = name;
		this.desc = desc;
		this.price = price;
	}
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
