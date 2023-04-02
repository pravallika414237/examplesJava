package assignment3;

import java.util.Arrays;

public class AddTwoMatrices {

	public static void main(String[] args) {
		int [][]a= 
			       {
			           {45,25},
					   {36,89},
					   {1,2}
			          
			           
					};
		int [][]b= 
				
			  {
		           {1,2},
				   {3,4},
				   {2,3}
		           
				};
		int[][]c = new int[3][2];
				
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length-1;j++)
			{
			c[i][j]=a[i][j]+b[i][j];	
			 System.out.print(c[i][j]+ " ");
			}
			System.out.println("");
		}
		
	}

}
