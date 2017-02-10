package com.dayone.models;

public class Models {
	private String ProductName;
	private float Price;
	private String ProductDetails;
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Models [ProductName=" + ProductName + ", Price=" + Price + ", ProductDetails=" + ProductDetails + "]";
	}
	public String getProductDetails() {
		return ProductDetails;
	}
	public void setProductDetails(String productDetails) {
		ProductDetails = productDetails;
	}
	
}
