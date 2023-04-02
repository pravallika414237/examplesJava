package basicpackage;

public class FourDArray {

	public static void main(String[] args) {
		int count=1;
		int marks[][][][]=
			{
				{
					{{41,22},{35,89}},
					{{54,93},{45,89}}
				},
				{
					{{89,58,54},{45,69,63}},
					{{58,25},{20}}},
				{
					{{85,584,754},{445,269,763}},
					{{584,125},{820}}
				 }
		   };

	

System.out.println("for each loop starts...");
for(int s[][][]:marks) {
	System.out.println("student : "+count);
	for(int [][]i:s) {
		
		for(int j[]:i) {
			for(int k:j) {
			 System.out.print( k+"  ");
           }
             System.out.println(" ");
		}}
	count++;
	
}}
		
	}