package examples;

import java.sql.*;

public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/chahe?useSSL=false" ;
		String uname="root";
		String upass ="root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, upass);
	    String query ="select * from customers";
		Statement st= con.createStatement();
		ResultSet rs = st.executeQuery(query);
	
		while(rs.next()) {
			System.out.println("accountid :"+ rs.getInt(1)+"name :"+ rs.getString(2));
			
		}
		rs.close();
		con.close();
	}

}
