package loopsExample;

import java.util.Scanner;

class CountVowelsExample {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter a string to count no.of vowels :");
		String s1 = s.nextLine().toLowerCase();
	      
		char []ch2=s1.toCharArray();
		
		int count=0;
		for(int i=0;i<ch2.length;i++)
		{
			if(ch2[i]=='a' ||ch2[i]=='e' || ch2[i]=='i' ||ch2[i]=='o' ||ch2[i]=='u'  )
			{
				count++;
				//System.out.println(ch2[i]);
			}
		}
		
		System.out.println("NUMBER OF VOWELS IN THE STRING IS :"+ count);
		

	}

}
