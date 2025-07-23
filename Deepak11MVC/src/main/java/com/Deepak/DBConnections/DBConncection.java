package com.Deepak.DBConnections;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConncection {
	public static Connection getcConnection() {
		Connection conn = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/deepakcrud", "root", "root");

		} catch (Exception e) {

			e.printStackTrace();
		}

		return conn;
	}
}