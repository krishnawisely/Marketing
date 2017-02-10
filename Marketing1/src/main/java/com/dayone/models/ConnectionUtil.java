package com.dayone.models;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConnectionUtil {
	public static BasicDataSource getsource()
	{
		BasicDataSource datasource=new BasicDataSource();
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://LocalHost:3306/krishna");
		datasource.setUsername("root");
		datasource.setPassword("root");
		return datasource;
	}
	public static JdbcTemplate gettemplate()
	{
		JdbcTemplate template=new JdbcTemplate();
		template.setDataSource(getsource());
		return template;
		
	}
}
