package bankaccountprj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Bankaccount_db {

	 public static Connection getconnection() {
			String driverClassName = "com.mysql.jdbc.Driver";//SPELLING MISTAKE OR URL NOT FOUND :: CLASSNOTFOUNDEXCEPTION
			String	url =  "jdbc:mysql://localhost:3306/bank_db";
		    String username = "root";
			String password  = "root";
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
	public static void main(String[] args) {
		
		Connection con =Bankaccount_db.getconnection();
	}

	/*public static void insert(String name,int age,int aadhar_no,int phone_no  ) throws SQLException {
		Connection con = Bankaccount_db.getconnection();
		String sql = "insert into register(enter_name,age,aadhar_no,phone_no) values (?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, name);
		pst.setInt(2, age);
		pst.setInt(3, aadhar_no);
		pst.setInt(4, phone_no);

		int rows = pst.executeUpdate();
		System.out.println("no of rows inserted:"+ rows);

}*/
}
