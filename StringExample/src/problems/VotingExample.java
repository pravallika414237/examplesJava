package problems;

import java.util.Scanner;

public class VotingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner s = new Scanner(System.in);
 
 System.out.println("enter country name:");
 String country= s.nextLine().toLowerCase();
 
 
 System.out.println("enter age:");
 //int age = Integer.parseInt(s.nextLine());
 int age = s.nextInt();
 s.nextLine();
 
 if(country.equals("india") && age>18)
   {
	 System.out.println("eligible for voting: ");
   }
 else if(age>18) {
	 System.out.println("eligible");
 }
 else 
    {
	 System.out.println("not eligible");
   }
	}

}
