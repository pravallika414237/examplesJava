package assignment2;
import java.util.Scanner;
//import java.lang.*;

public class ArthimeticOperators {

	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
		System.out.println("Enter the first Number : ");
		int d1=s.nextInt();
		s.nextLine();
		System.out.println("Enter the Secound Number : ");
		int d2=s.nextInt();
		s.nextLine();
		int x=d1-d2;
	s.close();
		
		
		System.out.println("SUM IS : "+(d1+d2));
		System.out.println("DIFFERENCE IS : "+(x));
		System.out.println("PRODUCT IS : "+(d1*d2));
		System.out.println("AVERAGE IS : "+(d1+d2)/2);
		System.out.println("MAX VALUE IS: "+ Math.max( d1, d2));
		System.out.println("MIN VALUE IS: "+ Math.min( d1, d2));
		System.out.println("DISTANCE IS: "+ Math.abs( x));

		
		
	}

}
