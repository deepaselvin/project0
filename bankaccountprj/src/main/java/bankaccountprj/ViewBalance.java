package bankaccountprj;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ViewBalance {
	public static void accinfo()throws SQLException, ClassNotFoundException {
		
		Connection con = accountBank.getconnection();

		Scanner sc =new Scanner(System.in);

		System.out.println("Enter Account Number");
		   int accno =sc.nextInt();
		   
		                 
		   String sql="select Account_no from register where Account_no='"+accno+"'" ;
		   PreparedStatement pst = con.prepareStatement(sql);
		   ResultSet rs = pst.executeQuery();

		   Integer AccountNumber = null;
		  
		while(rs.next())
		{
		   	 AccountNumber= rs.getInt("Account_no");
		
		if(AccountNumber!=null && AccountNumber.equals(accno))
		{
		String sql1="select Account_no,enter_name,Balance from register where Account_no='"+accno+"'";
		PreparedStatement pst1 = con.prepareStatement(sql1);
		   ResultSet rs1 = pst1.executeQuery();
		   while(rs1.next())
		   {
		   	System.out.println("########## BALANCE DETAIL  ###########");
		   	System.out.println(" ");
		   	System.out.print("AccountNumber     ");

		System.out.print("Username    ");

		System.out.println("Your balance   ");

		Integer AccountNumber1=rs1.getInt("Account_no");
		String UserName=rs1.getString("enter_name");
		Double Bal=rs1.getDouble("Balance");




		System.out.println( AccountNumber1+"              "+UserName+"             "+Bal+"       ");
		
		
	}
}
		}
	}
}
