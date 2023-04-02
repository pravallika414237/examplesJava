package assignment3;

public class SumValuesOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
	
		int[]a= {1,2,8,9};
          
            for(int b:a)
            {
            	//System.out.print(b+"  ");
            	sum=sum+b;
            }
            System.out.println("SUM OF ARRAY ELEMENTS : " +sum);
	}

}
