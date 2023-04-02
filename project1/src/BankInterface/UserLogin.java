package BankInterface;

import java.io.BufferedReader;

import java.io.*;
import java.util.*;

class SuccessfulUser {
	String amount;
	String name2;

	SuccessfulUser(String s2) throws IOException {
		File f2 = new File("example1.txt");
		FileReader fr = new FileReader(f2);
		FileWriter fw = new FileWriter(f2, true);
		BufferedReader br2 = new BufferedReader(fr);
		String s1;
		while ((s1 = br2.readLine()) != null) {
			if (s1.equals(s2)) {
				name2 = s1;
				amount = br2.readLine();
			}
		}

	}

	public void accBalance() {
		System.out.println("your balance is :" + amount);
	}

	public void accInfo(String s1) {
		System.out.println("you account info : " + "balance :" +amount + "\n"+"user details: " + s1 +"\n");
	}

	public void withdrawl() {

	}

	public void deposit() {

	}

	public void exit() {

	}
}

public class UserLogin {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("example1.txt");
		file.createNewFile();
		FileWriter f;
		FileReader r;

		String uspass;
		// TODO Auto-generated method stub

		do {
			System.out.println("1 : NEW USER /n 2 :SIGNIN ");
			System.out.println("enter 1 or 2 ");
			Scanner s = new Scanner(System.in);
			int menu = Integer.parseInt(s.nextLine());

			switch (menu) {
			case (1): {
				if (file.exists()) {
					System.out.println("Enter the user name : ");
					String userName = s.nextLine();
					System.out.println("enter password : ");
					String passWord = s.nextLine();
					System.out.println("confirm password : ");
					String confimPassWord = s.nextLine();
					if (passWord.equals(confimPassWord)) {
						f = new FileWriter(file, true);
						try {
							uspass = userName + confimPassWord;
							f.append("\n");
							f.append(uspass);

							System.out.println("registed successfully. Now LOGIN and DEPOSIT YOUR MONEY.");

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						f.close();

					} else {
						System.out.println("match the passwords:");
					}
				}
			}
				break;

			case (2):
				System.out.println("Enter the user name : ");
				String name = s.nextLine();
				System.out.println("enter password : ");
				String pass = s.nextLine();
				r = new FileReader("example1.txt");
				String s1;
				boolean flag2 = false;
				String s2 = name + pass;
				boolean flag = false;
				BufferedReader br = new BufferedReader(r);
				while ((s1 = br.readLine()) != null) {
					if (s1.equals(s2)) {

						flag = true;
					}
				}
				if (flag == true) {
					System.out.println("logged in");

					SuccessfulUser suser = new SuccessfulUser(name);

					do {

						System.out.println("_______________________________");
						System.out.println("1. ACCOUNT BALANCE");
						System.out.println("2.WITHDRAWL");
						System.out.println("3.ACCOUNT INFO");
						System.out.println("4.DEPOSIT");
						System.out.println("5.EXIT");
						System.out.println("_______________________________");
						System.out.println("ENTER THE OPTION : ");
						Scanner s3 = new Scanner(System.in);
						int option = Integer.parseInt(s3.nextLine());
						switch (option) {
						case (1): {
							suser.accBalance();
							break;
						}
						case (2): {
							suser.withdrawl();
							break;
						}
						case (3): {
							suser.accInfo(s2);
							break;
						}
						case (4): {
							suser.deposit();
							break;
						}
						case (5): {
							suser.exit();
							break;
						}
						default: {
							System.out.println("enter valid input : 1 or 2 or 3 or 4 or 5");
							flag2 = true;

						}
						}
					} while (flag2);

				} else {
					System.out.println("invalid login....try again. \n Enter user Details: ");

				}
//			br.close();
//			r.close();
			}
		} while (true);
	}

}
