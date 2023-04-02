package problems;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string : ");
		
		
		StringBuffer b= new StringBuffer();
		b.append(sc.nextLine());
		
		StringBuffer c= new StringBuffer(b);
		c.reverse();
		
		System.out.println(b);
        System.out.println(c);
        if(b.compareTo(c)==0)
        	System.out.println("palindrome");
        else System.out.println("not a palindrome"); 
	     
        
//       String  s1=b.toString();
//       String  s2=c.toString();
//       
//       if(s1.equals(s2)) {
//    	   System.out.println("palindrome");
//       }
//       else {
//    	   System.out.println("not a palindrome"); 
//       }
	}
}
