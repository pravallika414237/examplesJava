package databaseConnectivity;
import java.sql.*;

public class connectingMySql {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
String url= "jdbc:mysql://localhost:3306/atm_ui?useSSL=false";
String uname="root";
String upass="root";

Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection(url,uname,upass);

Statement st= con.createStatement();

ResultSet rs=  st.executeQuery("select * from accountHolders");

while(rs.next())
{
	System.out.println("user name : "+  rs.getString(2) +"   user account number : "+ rs.getInt(3) );
}
rs.close();
con.close();

	}

}
