package atm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import atm.datasource.JDBCUtils;
import atm.entity.User;


public class InsertPStatementExample {
    private static final String INSERT_USERS_SQL = "INSERT INTO users" +
        "  (id, name, email, country, password) VALUES " +
        " (?, ?, ?, ?, ?);";

	/*
	 * public static void main(String[] argv) throws SQLException {
	 * InsertPStatementExample createTableExample = new InsertPStatementExample();
	 * createTableExample.insertRecord(); }
	 */

    public static void insertRecord(User user) throws SQLException {
        System.out.println(INSERT_USERS_SQL);
        // Step 1: Establishing a Connection
        try (Connection connection = JDBCUtils.getConnection();
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
        	int i = 1;
            preparedStatement.setInt(i++, 1);
            preparedStatement.setString(i++, user.getUserName());
            preparedStatement.setString(i++, "tony@gmail.com");
            preparedStatement.setString(i++, "US");
            preparedStatement.setString(i++, "secret");

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

            // print SQL exception information
        	JDBCUtils.printSQLException(e);
        }

        // Step 4: try-with-resource statement will auto close the connection.
    }
}
