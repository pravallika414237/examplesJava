package StringStringbufferexample;

import java.util.Scanner;



public class IfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner s = new Scanner(System.in);
System.out.println("enter age:");
int a= Integer.parseInt(s.nextLine());

if(a>=0) 
	{
	System.out.println("positive");
	}
else {
	System.out.println("negative- enter positive");
}
if(a>=1  && a<=25)
   {
	System.out.println("25% disc");
   }
else if(a>=26  && a<=50)
{
	System.out.println("50% disc");
}
else if(a>=51  && a<=75)
{
	System.out.println("75% disc");
}
else 
{
	System.out.println("100% disc");
}
	}

}
