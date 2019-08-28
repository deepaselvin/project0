package bankaccountprj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class accountBank {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Beginmethod.begin();
		
	}

	public static Connection getconnection() {
		String driverClassName = "com.mysql.jdbc.Driver";// SPELLING MISTAKE OR URL NOT FOUND :: CLASSNOTFOUNDEXCEPTION
		String url = "jdbc:mysql://localhost:3306/bank_db";
		String username = "root";
		String password = "root";
		Connection con = null;

		try {
			Class.forName(driverClassName);
			con = DriverManager.getConnection(url, username, password);
			System.out.println(con);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;

	}
}
