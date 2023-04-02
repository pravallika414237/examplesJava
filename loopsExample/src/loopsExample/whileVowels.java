package loopsExample;

import java.util.Scanner;

public class whileVowels {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner s= new Scanner(System.in);
		  System.out.println("enter alphabet:");
		  char num =s.next().charAt(0);
		  
		 System.out.println(Character.toLowerCase(num));
		  num= Character.toLowerCase(num);
		   String w="hello";
		   System.out.println(w);
		   
		   Character ch= new Character('s');
		   ch.toLowerCase(num);
		   
		  switch(num)
		  {
		        case 'a':
		               
		        case 'e':
		        
		        case 'i':
		        
		        case 'o':
		        
		        case 'u':
		        
		        	 System.out.println("vowel");
		        	  break;
		        
		        default:
		        {
		        	System.out.println("consonant");
		        }
		        	

	}

	}}
