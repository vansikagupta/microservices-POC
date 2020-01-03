package com.learning.microservice.productcatalogservice.model;

public class CatalogItem {

	private String name;
	private String desc;
	private double price;
	private int count;
	
	public CatalogItem() {}
	
	public CatalogItem(String name, String desc, double price, int count) {
		super();
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.count = count;
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
		
	
}
