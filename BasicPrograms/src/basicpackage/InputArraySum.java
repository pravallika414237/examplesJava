package basicpackage;

import java.util.Scanner;

public class InputArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int n;
				int sum=0;
				int i=0;
				//int[]a;
		            Scanner s=new Scanner(System.in);
		               System.out.println("ENTER DESIRED ARRAY SIZE : ");
		                n= Integer.parseInt(s.nextLine());
		               int[]  a= new int[n];
		                 System.out.println("ENTER "+ n +"  ARRAY ELEMENTS  ");
		            for(int b:a)
		            {
		            	a[i]=Integer.parseInt(s.nextLine());
		            	i++;
		            }
		            for(int b:a)
		            {
		            	System.out.print(b+"  ");
		            	sum=sum+b;
		            }
		            System.out.println("SUM OF ARRAY ELEMENTS : " +sum);
			}

		


	}


