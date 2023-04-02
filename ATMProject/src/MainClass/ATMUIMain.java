package MainClass;
//1: password invisibility. 2:handling exception.
//
import java.sql.*;

import java.util.Scanner;

public class ATMUIMain {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/atm_ui?useSSL=false";
		String uname = "root";
		String upass = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection(url, uname, upass);
//
//		Statement st = con.createStatement();

		do {
			//Connection con = DriverManager.getConnection(url, uname, upass);

			Statement st = con.createStatement();
			System.out.println("_______________________________________________1");
			System.out.println("--------------ABC BANK ATM-------------------- ");
			System.out.println("1.LOGIN");
			System.out.println("2.REGISTER FOR ATM SERVICES");

			System.out.println("-----------------------------------------------");
			System.out.println("ENTER YOUR CHOICE : ");
			Scanner optionPage = new Scanner(System.in);
			int option = Integer.parseInt(optionPage.nextLine());
			System.out.println("________________________________________________2");

			switch (option) {
			case (1): {
				
				Scanner sc = new Scanner(System.in);
				System.out.println("enter user name:");
				String userName = sc.nextLine();
				System.out.println("enter password: ");
				String userPassword = sc.nextLine();
				
				String query1 = "select * from accountHolders where AccountHolderName= '" + userName
						+ "' and Userpassword='" + userPassword + "' ";
				ResultSet rs = st.executeQuery(query1);
				if (rs.next()) {
					System.out.println("Hello ! " + rs.getString(2) + "  you are logged in...");

					System.out.println("_______________________________________");

					System.out.println("1.check balance .");
					System.out.println("2.withdrawl ");
					System.out.println("3.Deposit");
					System.out.println("4.account INFO");
					System.out.println("5.Logout");
					int useOption = sc.nextInt();
					sc.nextLine();
					switch (useOption) {
					case 1: {
						System.out.println("your balance is " + rs.getString(5));
						System.out.println("_______________________________________");

						break;
					}
					case 2:{
						int withdrawlAmount;
						System.out.println("enter amount to withdraw :");
						withdrawlAmount = sc.nextInt();
						sc.nextLine();
						if(rs.getInt(5) >( withdrawlAmount  +1000)) {   //10000     >1500
						st.executeUpdate("update  accountHolders set balance= balance-'" + withdrawlAmount
								+ "' where AccountHolderName= '" + userName + "' and Userpassword= '" + userPassword
								+ "' ");
						System.out.println("COLLECT YOUR CASH");
						System.out.println("_______________________________________");
						}
						else {
							System.out.println("Insufficient balance. Minimum balance maitained is 1000");
						}
						break;
					}
					case 3: {
						int deposit;
						System.out.println("keep your money aligned in proper manner and then enter the amount.");

						System.out.println("enter amount to deposit :");

						deposit = sc.nextInt();
						sc.nextLine();
						st.executeUpdate("update  accountHolders set balance= balance+'" + deposit
								+ "' where AccountHolderName= '" + userName + "' and Userpassword= '" + userPassword
								+ "' ");
						System.out.println("Amount deposited to your account.");
						System.out.println("_______________________________________");

						// flag2 = false;
						break;
					}
					case 4: {
						System.out.println("account holder name is :   " + rs.getString(2));
						System.out.println("account number is :   " + rs.getString(3));
						System.out.println(" phone number :   " + rs.getString(4));
						System.out.println("your balance is :   " + rs.getString(5));
						System.out.println("email :    " + rs.getString(6));
						System.out.println("bank name :  " + rs.getString(7));

						System.out.println("home branch bank address :   " + rs.getString(8));
						System.out.println("_______________________________________");
						break;
					}
					case 5: {
						// flag2= false;
						break;
					}
					default: {
						System.out.println("Please enter valid option .");
						break;
					}
					}
				}
				else {
					System.out.println("<---------invalid credentials. please enter valid credentials.-------->");
				}
				//rs.close();
				break;
			}
			case (2): {

				String queryReg = "{call regAccountATM(?,?,?,?,?,?,?,?,?)} ";
				CallableStatement cs = con.prepareCall(queryReg);
				cs.registerOutParameter(9, Types.INTEGER);

				Scanner s = new Scanner(System.in);

				System.out.println("ENTER Account Holder Name :");
				String AccountHolderName = s.nextLine();

				System.out.println("ENTER Account Number :");
				int AccountNo = Integer.parseInt(s.nextLine());

				System.out.println("ENTER Phone Number :");
				String phone = s.nextLine();

				System.out.println("please enter minimum deposit of 1000 INR :");
				double balance = s.nextDouble();
				s.nextLine();
				System.out.println("ENTER email :");
				String email = s.nextLine();

				System.out.println("ENTER Bank Name :");
				String bankName = s.nextLine();

				System.out.println("ENTER Branch Address:");
				String branchAddress = s.nextLine();
//				
				System.out.println("ENTER password :");
				String Userpassword = s.nextLine();

//				regAccountATM(IN AccountHolderName varchar(25),
//						IN AccountNo int(10),IN phone int(10),IN balance double(10,2),
//						IN email varchar(20),IN bankName varchar(20),IN branchName varchar(25),
//						IN branchAddress varchar(25),IN Userpassword varchar(20), OUT AccountId int(10))
				int i =2;
				cs.setString(i++, AccountHolderName);
				cs.setLong(i++, AccountNo);
				cs.setString(i++, phone);
				cs.setDouble(i++, balance);
				cs.setString(i++, email);
				cs.setString(i++, bankName);
				cs.setString(i++, branchAddress);
				cs.setString(i++, Userpassword);
				//cs.setString(i++, Userpassword);
				cs.execute();

				Integer a = cs.getInt(9);
				System.out.println("registered successfully");
				break;
			}
			default:
				System.out.println("PLEASE ENTER VALID OPTION : 1 OR 2:");
			}
		} while (true);

	}
}