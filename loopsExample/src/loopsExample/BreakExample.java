package loopsExample;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter no.of times your loop should rum...");
		int no= Integer.parseInt(s.nextLine());
		
		for(int x = 1; x<=no ;x++)
		{
			
			
			if(x% 4 == 0) {
				//System.out.println("number is "+ x);
				continue;
			}
			System.out.println( x);
		}

	}

}
