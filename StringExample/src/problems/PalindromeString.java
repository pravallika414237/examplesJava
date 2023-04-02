package problems;
import java.util.*;
public class PalindromeString {

	public static void main(String[] args) {
		
 Scanner s = new Scanner(System.in);
 System.out.println("ENTER STRING :");
 String s1 = s.nextLine();
 
 //System.out.println(s1.length());
 String s2="";
 for(int i=(s1.length()-1);i>=0;i--) {
	s2=s2+s1.charAt(i) ;
 }
 
 System.out.println(s2);
 if(s1.equals(s2)) {
	 System.out.println("palindrome");
 }
 else { System.out.println(" not a palindrome");
 }
}}
