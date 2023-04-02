package assignment3;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a= 
		       {
		           {45,25},
				   {36,8},
				   {11,22}
		        };
		
		int rows = a.length;
		int cols = a[0].length;
		//System.out.println("--> "+cols);
		int[][]c = new int[cols][rows];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
			c[j][i]=a[i][j];
			}
			
	    }
		
		for(int l[]:c) {
			System.out.println("row: ");
			for(int m:l) {
				System.out.print( m+" ");
			}
			System.out.println(" ");
		}
		

}}
