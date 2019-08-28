package bankaccountprj;

import java.sql.SQLException;
import java.util.Scanner;

public class Beginmethod {

	public static void begin()throws SQLException, ClassNotFoundException {
	Register reg = new Register();
	LoginBank log = new LoginBank();
	Scanner scanner = new Scanner(System.in);
	System.out.println("register(1)/login(2):");
	int a = scanner.nextInt();
	

	switch (a) {
	case 1: 
		System.out.println("Register");
		reg.register();

		begin();
		break;

	case 2: 
		System.out.println("ENTERING INTO ACCOUNT...");
		log.login();
		begin();
		break;

	}
}
}
