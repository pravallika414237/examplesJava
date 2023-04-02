package assignment3;

public class DiagonalSumMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a=
			{{1,2,3},{4,5,6},{7,8,9}};
		int[]b= {3,6,9};
		int count=0;
		int max=0;
		for(int j=0,i=0;i<a.length;i++,j++)
		{
			if(i==j)
			{
				count=a[i][j]+count;
			}
			if(b[i]>max)
			{
				max=b[i];
			}
		}
		System.out.println(count +" "+max);
		
		

	}

}
