package assignment3;


import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
				
	Scanner s= new Scanner(System.in);
	int x=Integer.parseInt(s.nextLine());
	int y=Integer.parseInt(s.nextLine());
	final int l=x;
	
for(int i=1;i<y;i++) {
	x=x*l;
}
System.out.println(x);
}}
