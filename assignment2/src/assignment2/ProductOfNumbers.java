package assignment2;
import java.util.*;
public class ProductOfNumbers {
public static void main(String []args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the first Number to find product : ");
	double d1=s.nextDouble();
	System.out.println("Enter the Secound Number to find product : ");
	double d2=s.nextDouble();
	s.close();
	System.out.println("PRODUCT IS : "+d1*d2);
}
}
