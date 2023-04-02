package assignment2;
import java.util.*;

public class TableOfInputNumber {

	public static void main(String[] args) {
		
Scanner scan= new Scanner(System.in);
System.out.println("which table you are weak in??");
 int a=Integer.parseInt(scan.nextLine());
 scan.close();
 System.out.println("Learn with me....");
 for(int i=1;i<=10;i++) {
	 
	 System.out.println( a+" * "+i+" =  "+(a*i));
 }
	}

}
