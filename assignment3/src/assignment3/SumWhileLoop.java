package assignment3;

import java.util.Scanner;

public class SumWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=true;
		
		while(flag) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the first Number : ");
			int d1=s.nextInt();
			s.nextLine();
			System.out.println("Enter the Secound Number : ");
			int d2=s.nextInt();
			s.nextLine();
		
			
			System.out.println("SUM IS : "+(d1+d2));
			System.out.println("want to perfrom addition once more. \n enter 1 0r 2 only : 1.yes/2.no");
			int i=Integer.parseInt(s.nextLine());
			if(i==1) {
				flag=true;
				
			}
			else {
				
			flag=false;
			System.exit(0);
			//return;
			}
			


	}
	}}

