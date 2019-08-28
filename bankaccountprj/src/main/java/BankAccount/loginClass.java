package BankAccount;

import java.util.Scanner;

public class loginClass {
 static int login()
	
	{	System.out.println("LOGIN");
	System.out.println("USER NAME:");
	Scanner scanner12 = new Scanner(System.in);
	int c = scanner12.nextInt();
	System.out.println("PASSWORD");
	Scanner scanner13 = new Scanner(System.in);
	int d = scanner13.nextInt();

		System.out.println
		("MAIN MENU"+
		"\n"+"1.DEPOSIT"+
	    "\n"+"2.WITHDRAW"+
		"\n"+"3.FUND TRANSFER"+
	    "\n"+"4.VIEW BALANCE"+
		"\n"+"5.TRANSACTION HISTORY"+
	    "\n"+"6.ACTIVATE DEACTIVATE ACCOUNT");
	
	Scanner scanner14 = new Scanner(System.in);
	int e = scanner14.nextInt();
	return e;
}
	public static void main(String[] args) {
		int c=login();
		// TODO Auto-generated method stub

	}

}
