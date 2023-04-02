package midland_bakery;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Midland_menu {
	// declaration of  our variable for Price  of food Items...
	int FrenchFries = 120;
	int Burger = 150;
	int Pastry = 170;
	int pizza = 250;
	int ColdCoffee = 65;
	int ColdDrinks = 75;
	int IceTea = 95;
	int ch;
	int quantity;
	String order=" ";
	String again;
	static int total;
	Scanner sc=new Scanner(System.in);
	
	// Lets Create a methods for displaying our food items
	
	public void displayMenue() {
		System.out.println("****** Wel-Come To UR Cafe ******");
		System.out.println("*****************");
		System.out.println("                 1. French Fries           120/-");
		System.out.println("                 2. Burger                 150/-");
		System.out.println("                 3. Pastry                 100/-");
		System.out.println("                 4. Pizza                  250/-");
		System.out.println("                 5. Cold Coffee            65/- ");
		System.out.println("                 6. Cold Drinks            75/- ");
		System.out.println("                 7. Ice-Tea                95/- ");
		System.out.println("                 8. Exit                        ");
		System.out.println("*****************");
		System.out.println("                What Do You Want To Order Today ??");
		
	}
	
	
	// Create a method to order a food item 
	// Using Switch case for this...
	
	// we need to create a method for bill ..
	public void generateBill() throws IOException {
		System.out.println();
		System.out.println("****** Thankyou For Ordering *****");
		System.out.println();
		System.out.println("****** Your Bill is : " + total +" " + "****");
		
		 File f=new File ("order.txt");
		
		FileWriter fw = new FileWriter(f, true);
		try {
			
			fw.append("\n");
			fw.append(order+"---------------->" +total);
			
		} catch (IOException e) {
			System.out.println("order not placed in the list.");
		}
		fw.close();
		
	}
	
	public void order() throws IOException {
		while(true) {
		System.out.println(" Enter Your Choice ");
		ch=sc.nextInt();
		switch (ch) {
		case 1: //French Fries
			
			System.out.println("You have Selected French Fries : ");
			System.out.println();
			System.out.println("Enter the desired Quatity : ");
			quantity=sc.nextInt();
			String s=Integer.toString(quantity);

			total=total+quantity*FrenchFries;
			order= order + " FrenchFries " +s +",";
			
			
			break;
			
		case 2: // Burger
			
			System.out.println("You have Selected Burger : ");
			System.out.println();
			System.out.println("Enter the desired Quatity : ");
			quantity=sc.nextInt();
			String s2=Integer.toString(quantity);
			total=total+quantity*Burger;
			order = order +"burger  " +s2+",";
			break;
			
		case 3: // Pastry
			System.out.println("You have Selected Pastry : ");
			System.out.println();
			System.out.println("Enter the desired Quatity : ");
			quantity=sc.nextInt();
			String s3=Integer.toString(quantity);
			total=total+quantity*Pastry;
			order = order +"pastry  "+s3 +",";
			break;
			
		case 4: //Pizza
			System.out.println("You have Selected Pizza : ");
			System.out.println();
			System.out.println("Enter the desired Quatity : ");
			quantity=sc.nextInt();
			String s4=Integer.toString(quantity);
			total=total+quantity*pizza;
			order = order +" pizza  "+s4+",";
			break;
			
		case 5: // ColdCoffee
			System.out.println("You have Selected ColdCoffee : ");
			System.out.println();
			System.out.println("Enter the desired Quatity : ");
			quantity=sc.nextInt();
			String s5=Integer.toString(quantity);

			total=total+quantity*ColdCoffee;
			order = order +"coldcoffe  "+s5+",";
			break;
			
		case 6: // ColdDrinks
			System.out.println("You have Selected ColdDrinks : ");
			System.out.println();
			System.out.println("Enter the desired Quatity : ");
			quantity=sc.nextInt();
			String s6=Integer.toString(quantity);

			total=total+quantity*ColdDrinks;
			order = order +"colddrinks "+s6+",";
			break;
			
		case 7: // IceTea
			System.out.println("You have Selected IceTea : ");
			System.out.println();
			System.out.println("Enter the desired Quatity : ");
			quantity=sc.nextInt();
			String s7=Integer.toString(quantity);

			total=total+quantity*IceTea;
			order = order +"icetea "+s7+",";
			break;
			
		case 8: // Exit
			System.exit(1);
			break;
			
			default:
				break;
		}
		System.out.println();
		System.out.println(" Do You Want To order Anything Else (Y/N)");
		again=sc.next();
		if(again.equalsIgnoreCase("Y"))
		{order();}
		else if(again.equalsIgnoreCase("N"))
		{
			generateBill();
		displayMenue();
		order();
		}
		else {System.out.println(" Invalid Choice ");}
	}
}
}

