package practise;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class CustomerRegProcedure {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chahe?useSSL=false", "root", "root");

		// in cust_name varchar(100),in phone varchar (11), in gender varchar(20),in dob
		// date ,in age int)
		String query = "call set_customer(?,?,?,?,?)";

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
		
		CallableStatement cs = con.prepareCall(query);
		
		cs.setString(1,name);
		cs.setString(2,phone);
		cs.setString(3,gender);
		cs.setString(4,dob);
		cs.setInt(5,age);
		
		boolean flag=cs.execute();
		if(flag==false) {
			System.out.println("record saved");
		}
		else {
			System.out.println("please register with correct details");
		}
		
	}
}
