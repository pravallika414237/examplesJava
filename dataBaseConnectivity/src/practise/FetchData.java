package practise;
import java.sql.*;
public class FetchData {

	public static void main(String [] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/chahe?useSSL=false","root","root");
		
		Statement st= con.createStatement();
		
		ResultSet rs=st.executeQuery("select * from customers ");
		
		while(rs.next()) {
			if(rs.getInt(1)> 3) {
				System.out.println("hi  " +rs.getString(2)+ " welcome !" + rs.getString(3));
			}
			
		}
		
	}
}
