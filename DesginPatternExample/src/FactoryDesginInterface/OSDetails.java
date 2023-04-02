package FactoryDesginInterface;

import java.util.Scanner;

public class OSDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         FactoryPlan plan1= new FactoryPlan();
         Scanner sc = new Scanner(System.in);
         System.out.println("enter your os type :");
         String s = sc.nextLine();
         OperatingSystem os1= plan1.getPlan(s);
         os1.getSystemDetails();
	}

}
