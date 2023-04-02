package databaseConnectivity;


import java.sql.*;

public class UpdatingRecordInDatabase {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url= "jdbc:mysql://localhost:3306/atm_ui?useSSL=false";
		String uname="root";
		String upass="root";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,upass);

		Statement st= con.createStatement();
       
	st.executeUpdate("update  accountHolders set balance= balance+1000  where AccountNo= 12346" );
		
		ResultSet rs = st.executeQuery("select * from accountHolders where AccountHolderName ='pravallika'");
		while(rs.next())
		{
			System.out.println("user name : "+  rs.getString(2) +"   user account number : "+ rs.getInt(3) );
		}
		rs.close();
		con.close();

	}

}
