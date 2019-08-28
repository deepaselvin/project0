package bankaccountprj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ShowMethod {

	public static void show()throws SQLException, ClassNotFoundException {
		Connection con =accountBank.getconnection();

	System.out.println("Select 1 : View Balance\n 2 : Deposit\n 3 : Withdrawal\n 4 : Fund Transfer");
	Scanner scn = new Scanner(System.in);
	int a = scn.nextInt();
	
	 while(a!=5) {
			switch (a) {

			case 1:
				System.out.println("View Balance");

				 ViewBalance.accinfo();
				//System.out.println(bal);
				show();
				break;
				
			case 2:

				Scanner scn1 = new Scanner(System.in);
				System.out.println("Enter Account Number");
				int accountNumber = scn1.nextInt();

				System.out.println("ENTER AMOUNT:");
				Scanner scanner02 = new Scanner(System.in);
				int Deposit = scanner02.nextInt();
				Deposit depo = new Deposit();
				int bal0=depo.depinfo(accountNumber);
				System.out.println(bal0);
				//DepositUpdate depo1=new DepositUpdate();
				//depo1.depinfo(accountNumber);
			

				int totalBalance = bal0 + Deposit;
				System.out.println("AVAILABLE BALANCE:"+totalBalance);
				
				

				String sql1 = "update register set Balance=? where Account_no=?";
				PreparedStatement pst1 = con.prepareStatement(sql1);
				pst1.setInt(1, totalBalance);
				pst1.setInt(2, accountNumber);
				pst1.executeUpdate();
				System.out.println("AMOUNT DEPOSITED SUCCESSFULLY");
				show();
				break;
				
				

			case 3:
				System.out.println("Withdrawal");

				Scanner scn12 = new Scanner(System.in);
				System.out.println("Enter Account Number");
				int accountNumber1 = scn12.nextInt();

				System.out.println("ENTER AMOUNT:");
				Scanner scanner2 = new Scanner(System.in);
				int withdraw = scanner2.nextInt();
				
				Deposit depo1 = new Deposit();
				int balance1=depo1.depinfo(accountNumber1);
				//withdrawinfo with = new withdrawinfo();
				//with.withdraweninfo(accountNumber1);
			
				

				int totalBalance1 = balance1 - withdraw;
				System.out.println("AVAILABLE BALANCE:"+totalBalance1);

				String sql11 = "update register set Balance=? where Account_no=?";
				PreparedStatement pst11 = con.prepareStatement(sql11);
				pst11.setInt(1, totalBalance1);
				pst11.setInt(2, accountNumber1);
				pst11.executeUpdate();
				System.out.println("TRANSACTION  SUCCESSFUL");
				show();
				break;

			case 4:
				System.out.println("Fund Transfer");
				Scanner scn2 = new Scanner(System.in);
				System.out.println("Enter the From Account Number");
				int fromacc = scn2.nextInt();
				System.out.println("Enter the To Account Number");
				int accountNumber2 = scn2.nextInt();
				System.out.println("Enter the  Amount  to be transffered:");
				int tramt = scn2.nextInt();
			
				Deposit depo2 = new Deposit();
				int bal01=depo2.depinfo(accountNumber2);
				System.out.println(bal01);
				
				if (bal01 >= tramt) {
					bal01 = bal01 - tramt;
					
					String sql111 = "update register set Balance=? where Account_no=?";
					PreparedStatement pst111 = con.prepareStatement(sql111);
					pst111.setInt(1, bal01);
					pst111.setInt(2, accountNumber2);
					pst111.executeUpdate();
					System.out.println("AVAILABLE BALANCE:"+bal01);
					System.out.println("TRANSACTION  SUCCESSFUL");
					
					
				} 
				else {
					System.out.println("Transaction Failed");
				}
				show();
				break;

			}
		}
		}

		
	}



