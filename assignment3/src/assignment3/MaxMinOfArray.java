package assignment3;

public class MaxMinOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int []a= {45,85,96,25,16};
    int max=0;
    int min=0;
    for(int i=0;i<a.length;i++)
    {
    	if(max<a[i])
    	{
    	  max=a[i];	
    	}
    	if(max>a[i])
    	{
    	  min=a[i];	
    	}
    }
    System.out.println("max value of array is : "+ max );
    System.out.println("min value of array is : "+ min );
	}

}
