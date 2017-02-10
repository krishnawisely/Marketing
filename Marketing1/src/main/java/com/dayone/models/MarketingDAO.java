package com.dayone.models;

public class MarketingDAO {
	public static void add(Models model)
	{
		String sqlquery="insert into marketing1(productname,price,productdetails)values(?,?,?)";
		Object [] params={model.getProductName(),model.getPrice(),model.getProductDetails()};
		ConnectionUtil.gettemplate().update(sqlquery,params);

	}
}
