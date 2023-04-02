package FileHandlingExamples;
//class MyObjectOutputStream extends ObjectOutputStream{
//
//	protected MyObjectOutputStream() throws IOException, SecurityException {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	protected MyObjectOutputStream(OutputStream o) throws IOException, SecurityException {
//		super();
//	}
//	
//	public void writeStreamHeader() throws IOException{
//		return;
//	}
//	}
import java.util.*;
import java.io.*;

public class WriteUserDetailsExample {

	public static void main(String[] args) throws IOException {
		File file = new File("example1.txt");
		FileWriter f;
		FileReader r;
		//String uname;
		String uspass;
		// TODO Auto-generated method stub
		System.out.println("1 : NEW USER /n 2 :SIGNIN ");
		System.out.println("enter 1 or 2 ");

		Scanner s = new Scanner(System.in);
		int menu = Integer.parseInt(s.nextLine());

		switch (menu) {
		case (1): {
			if (file.exists()) {
				System.out.println("Enter the user name : ");
				String name = s.nextLine();
				System.out.println("enter password : ");
				String pass1 = s.nextLine();
				System.out.println("confirm password : ");
				String pass2 = s.nextLine();
				if (pass1.equals(pass2)) {
					f = new FileWriter(file, true);
					try {
						uspass = name + pass2;
						f.append("\n");
						f.append(uspass);
						

						System.out.println("registed successfully.");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					f.close();

				} else {
					System.out.println("match the passwords:");
				}
			}
		}break;

		case (2):
			System.out.println("Enter the user name : ");
			String name = s.nextLine();
			System.out.println("enter password : ");
			String pass = s.nextLine();
			r = new FileReader("example1.txt");
			String s1;
			String s2 = name + pass;
			boolean flag = false;
			BufferedReader br = new BufferedReader(r);
			while ((s1 = br.readLine()) != null) {
				if (s1.equals(s2)) {
					
					flag = true;
				} }
			if(flag==true) {
				System.out.println("logged in");
			}
			else {
				System.out.println("invalid login");
			}br.close();
			r.close();
			}
			
		}

	}

