package bankaccountprj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DepositUpdate {
	public static void deinfo(int accountNo)throws SQLException, ClassNotFoundException {

		Connection con =accountBank.getconnection();
		
		String sql11 = "update account_details set Balance=? where Account_no=?";
		PreparedStatement pst11 = con.prepareStatement(sql11);
		pst11.setInt(1, totalBalance);
		pst11.setInt(2, accountNumber);
		pst11.executeUpdate();
		System.out.println("TRANSACTION  SUCCESSFUL");
	}
}
