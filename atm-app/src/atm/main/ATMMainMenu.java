package atm.main;

import java.sql.SQLException;

import atm.dao.InsertPStatementExample;
import atm.dao.UpdatePStatementExample;
import atm.entity.User;

public class ATMMainMenu {
	private static final String INSERT_USERS_SQL = "INSERT INTO users" +
	        "  (id, name, email, country, password) VALUES " +
	        " (?, ?, ?, ?, ?);";
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		User user = new User();
		
		
		InsertPStatementExample.insertRecord(user);
		UpdatePStatementExample.updateRecord(user);
	}

}
