package examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/chahe?useSSL=false";
		String uname = "root";
		String upass = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, upass);
		Scanner sc = new Scanner(System.in);

		

		System.out.println("enter phone :");

		String phone =
		sc.nextLine();
		
		System.out.println("enter name :");

		String name = sc.nextLine();

		String query = "update customers set phone='"+phone+"' where customer_name ='"+name+"'" ;
	//	String query1= "delete userdetails  where userid ="+id ;
	 //   String query ="select * from userdetails";
		Statement st= con.createStatement();
		st.execute(query);
		System.out.println("recoord saved");
		con.close();

	}

}
