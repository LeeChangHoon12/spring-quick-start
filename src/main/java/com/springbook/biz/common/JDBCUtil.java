package com.springbook.biz.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUtil {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			
			Class.forName("org.");
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) {
		// TODO Auto-generated method stubß
		System.out.println("close");
		
	}
}