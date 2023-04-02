package assignment3;
import java.util.*;

public class RandomNumber {

	public static void main(String[] args) {
		
	//int max=100;
	//int min=0;
	//int	a=(int) Math.random()*(max-min+1)+min;
//System.out.println(a);
		
		boolean flag=true;
		Random r= new Random();
		final int x=r.nextInt(100);
		System.out.println(x);
	
		while(flag) {
		    Scanner s =new Scanner(System.in);
		    System.out.println("Guess the random number : ");
		    int a= Integer.parseInt(s.nextLine());
		
		
		if(a>x) 
		{ 
			 System.out.println("ENTERED NUMBER IS TOO LARGE. TRY AGAIN.");
			 
		}
		else if(a<x) 
		{
			System.out.println("ENTERED NUMBER IS TOO SMALL. TRY AGAIN.");
			
			 
		}
		else if (a==x){
			System.out.println("congrats you done a right guess...!");
			 flag=false;
		}

}}}
