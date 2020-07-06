package br.com.soc.exame.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConection {
	
	public static Connection getConnection() throws Exception {
		try {
			Class.forName("org.h2.Driver");
			return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/soc.db", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
