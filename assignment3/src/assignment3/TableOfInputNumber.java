package assignment3;
import java.util.*;

public class TableOfInputNumber {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("ENTER NUMBER TO LEARN TABLE : ");
		int a = Integer.parseInt(s.nextLine());
		a=Math.abs(a);
 s.close();
 
 for(int i=1;i<=10;i++) {
	 System.out.println( a +" * "+ i +  "  =  "+(a*i));
 }
	}

}
