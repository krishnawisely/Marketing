package com.dayone.models;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Models modelobject=new Models();
		System.out.println("Enter product name\n");
		Scanner input=new Scanner(System.in);
		String productname=input.next();
		modelobject.setProductName(productname);
		System.out.println("Enter the price\n");
		float price=input.nextFloat();
		modelobject.setPrice(price);
		System.out.println("Enter the product details\n");
		input.nextLine();
		String details=input.nextLine();
		modelobject.setProductDetails(details);
		System.out.println(modelobject);
		MarketingDAO daoobject=new MarketingDAO();
		daoobject.add(modelobject);

	}

}
