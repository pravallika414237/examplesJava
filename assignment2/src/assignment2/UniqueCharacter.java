package assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueCharacter {

	public static void main(String[] args) {
		
		boolean flag =true;
		Scanner sc= new Scanner(System.in);
		String input = sc.nextLine();
		
		char [] ch = input.toCharArray();
		
		//Arrays.sort(ch);
		
		for(int i=0; i<ch.length-1 ; i++) {
			if(ch[i]!= ch[i+1])
				continue;
			else 
				flag=false;
		}
		
		if(flag == true) {
		System.out.println("unique character string");

	}
		else {
			System.out.println("non-unique character string");
		}
	}}

