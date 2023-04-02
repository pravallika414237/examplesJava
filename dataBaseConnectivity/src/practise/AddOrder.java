package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AddOrder {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chahe?useSSL=false", "root", "root");

		Statement st = con.createStatement();
		// in cust_name varchar(100),in phone varchar (11), in gender varchar(20),in dob
		// date ,in age int)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter name :");
		String name = sc.nextLine();
		
		System.out.println("enter phone :");
		String phone = sc.nextLine();
		
		System.out.println("enter gender :");
		String gender = sc.nextLine();

		System.out.println("enter dob :");
		String dob = sc.nextLine();
		
		System.out.println("enter age :");
		int age = sc.nextInt();
		sc.nextLine();
		
		String query = "insert into userdetails values("+name+",'"+phone+"','"+gender+",'"+dob+"',"+age+")";
		st.execute(query);
		
		System.out.println("record saved");
		con.close();
	}
}
