package assignment;

import java.util.Scanner;

public class AsifQuestion {

	public static void main(String [] args) {
		
		Scanner sc= new Scanner(System.in);
		String input = sc.nextLine();
		
		
		int lengthOfstring = input.length();
		
		
	if(input.endsWith("1")) {
		String lastChars =input.substring(lengthOfstring-2, lengthOfstring-1);
		input =input.concat(lastChars);
		
	}
	
		
	}
}
