package assignment2;
import java.util.*;

public class SumOfDigitsOfInteger {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number to get sum of digits : ");
		int a=Integer.parseInt(s.nextLine());
		System.out.println("Sum of digits of provide number is : ");
		s.close();
		//int a=3410;
		int sum=0;
		while(a>0) {
		int val=a%10;
		sum+=val;
		a=a/10;
		}
System.out.println(sum);
	}

}
