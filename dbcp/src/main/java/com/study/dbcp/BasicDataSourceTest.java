package com.study.dbcp;

import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;

public class BasicDataSourceTest {

	public static void main(String[] args) {

		try {
			Properties pro = new Properties();
			pro.load(BasicDataSourceTest.class.getClassLoader()
					.getResourceAsStream("dbcp.properties"));
			BasicDataSource ds = BasicDataSourceFactory.createDataSource(pro);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
