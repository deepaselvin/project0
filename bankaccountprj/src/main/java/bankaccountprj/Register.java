package bankaccountprj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;



public class Register {
	 Connection con =accountBank.getconnection();
	
  static void register() throws SQLException
 {
	 Scanner scanner11 = new Scanner(System.in);
 	System.out.println(" enter Name:");
 	String name = scanner11.next();
 	System.out.println(" enter Password:");
 	String enter_password = scanner11.next();
 	System.out.println("Enter Account Number");
	int Account_no=scanner11.nextInt();
 	System.out.println("enter age");
 	int age = scanner11.nextInt();
 	System.out.println("enter aadhar No:");
 	int aadhar_no = scanner11.nextInt();
 	System.out.println(" enter Phn No:");
 	long phone_no = scanner11.nextLong();
 	System.out.println("enter Intial balance:");
 	int Balance = scanner11.nextInt();
 	//System.out.println("enter Name:"+b1 +" \n "+"enter age"+b2 +" \n "+"enter Phn No:"+b3 +" \n " +"enter aadhar No:"+b4);
 	System.out.println("Registered sucessfully");
 	
 	
 	Connection con =accountBank.getconnection();
	String sql = "insert into register(enter_name,enter_password,Account_no,age,aadhar_no,phone_no,Balance) values (?,?,?,?,?,?,?)";
	PreparedStatement pst = con.prepareStatement(sql);
	pst.setString(1, name);
	pst.setString(2, enter_password);
	pst.setInt(3, Account_no);
	pst.setInt(4, age);
	pst.setInt(5, aadhar_no);
	pst.setLong(6, phone_no);
	pst.setInt(7, Balance);

	int rows = pst.executeUpdate();
	


	
 }
  
	  
  
	

}
