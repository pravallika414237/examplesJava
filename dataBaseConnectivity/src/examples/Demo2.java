package examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false";
		String uname = "root";
		String upass = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, upass);
		Scanner sc = new Scanner(System.in);

		System.out.println("enter age :");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.println("enter address :");

		String address = sc.nextLine();
		
		System.out.println("enter name :");

		String name = sc.nextLine();

		String query = "insert into userdetails values(5,"+age+",'"+address+"','"+name+"')";
	
		Statement st= con.createStatement();
		st.execute(query);
		System.out.println("recoord saved");
		con.close();

	}

}
