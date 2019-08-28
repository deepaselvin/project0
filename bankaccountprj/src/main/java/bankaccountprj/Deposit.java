package bankaccountprj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Deposit {
	public static int depinfo(int accno)throws SQLException, ClassNotFoundException {
		Connection con =accountBank.getconnection();
		
		
	
	
	String sql1 = "select Balance from register where Account_no=?";
	PreparedStatement pst11 = con.prepareStatement(sql1);
	pst11.setInt(1,accno);
	ResultSet rs=pst11.executeQuery();
	int balance=0; 
	if(rs.next())
	{
		balance=rs.getInt(1);
	}
	
	return balance;
		/*
		 * int totalBalance=balance+Deposit;
		 * 
		 * String sql = "update account_details set Balance=? where Account_no=?";
		 * PreparedStatement pst1= con.prepareStatement(sql);
		 * pst1.setInt(1,totalBalance); pst1.setInt(2,accountNumber);
		 * pst1.executeUpdate();
		 */
}
}
