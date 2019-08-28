package bankaccountprj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginBank {
	static void login() throws SQLException, ClassNotFoundException {
		System.out.println("LOGIN");
		System.out.println("USER NAME:");
		Scanner scanner12 = new Scanner(System.in);
		String enter_name = scanner12.next();
		System.out.println("PASSWORD");
		String enter_password = scanner12.next();

		Connection con = accountBank.getconnection();
		String sql = "select * from register where enter_name=? and enter_password=?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, enter_name);
		pst.setString(2, enter_password);

		ResultSet rs = pst.executeQuery();
		if (rs.next()) {
			System.out.println("Login sucessfully");

			// System.out.println("no of rows inserted:"+ rows);

			
			Connection con1 = Bankaccount_db.getconnection();
			ShowMethod sh=new ShowMethod();
			sh.show();
			
		}
			// System.out.println("MAIN MENU" + "\n" + "1.DEPOSIT" + "\n" + "2.WITHDRAW" +
			// "\n" + "3.FUND TRANSFER" + "\n"
			// + "4.VIEW BALANCE" + "\n" + "5.TRANSACTION HISTORY" + "\n" + "6.ACTIVATE
			// DEACTIVATE ACCOUNT");
			
			else 
			{
				System.out.println("Invalid username or password");
					}

}
}
