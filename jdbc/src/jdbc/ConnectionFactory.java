package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		System.out.println("Conectando...");
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/regescweb", "root", "*4730Nani*");
		}catch (SQLException e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}

}
