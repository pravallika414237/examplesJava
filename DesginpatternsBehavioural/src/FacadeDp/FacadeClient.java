package FacadeDp;

import java.util.Date;
import java.util.Scanner;

public class FacadeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TravelAgent ta = new TravelAgent();
		boolean flag = true;
		while (flag) {
			System.out.print("____________ABC TRAVEL TOURS_________________");
			Date d = new Date();
			System.out.println(d.toLocaleString());
			System.out.println("1.DISPAY ALL PACKAGES.");
			System.out.println("2.DISPLAY BUDGET PACKS");
			System.out.println("3.DISPLAY GOLD PACKS");
			System.out.println("4.DISPLAY LUXURY PACKS");
			System.out.println("5.GET FORM TO BUY ANY PACKAGE.");
			System.out.println("6.EXIT");
			Scanner sc = new Scanner(System.in);
			System.out.println("ENETR YOUR OPTION TO DISPLAY PACKAGES:");
			int a = Integer.parseInt(sc.nextLine());
			switch (a) {
			case 1: {
				System.out.println("--------------------------------------------");
				ta.getBp();
				System.out.println("--------------------------------------------");
				ta.getGp();
				System.out.println("---------------------------------------------");
				ta.getLp();
				System.out.println("________________________________________________");
				break;
			}
			case 2: {
				System.out.println("--------------------------------------------");
				ta.getBp();
				System.out.println("--------------------------------------------");
				break;
			}
			case 3: {
				System.out.println("--------------------------------------------");
				ta.getGp();
				System.out.println("---------------------------------------------");
				break;
			}
			case 4: {
				System.out.println("---------------------------------------------");
				ta.getLp();
				System.out.println("________________________________________________");
				break;
			}
			case 5:
			{
				System.out.println("-----please fill the form to buy any package--------");
				System.out.println("enter your name :");
				String name = sc.nextLine();
				System.out.println("enter your mobile number");
				String phone = sc.nextLine();
				System.out.println("enter your intersted package name");
				String opt = sc.nextLine();
				System.out.println("SAVED YOUR interset. we will get back to you soon... \n THANKYOU");
                 break;
			}
			case 6:
			{
				flag=false;
				
			}
			default:
				System.out.println("enter valid option.");
			}
			
		}
	}
}