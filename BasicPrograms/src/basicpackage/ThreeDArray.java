package basicpackage;

public class ThreeDArray {

	public static void main(String[] args) {
		
		int count=1;
		int marks[][][]=
			{
				{
					{41,22,35,89},
					{54,93,89}
				},
				{
					{89,58,54,45,69,63},
					{58,25,20}
				}
		    };

		System.out.println("for loop starts...");
		for(int l=0;l<marks.length;l++) {
		  for(int i=0;i<marks[l].length;i++) {
			   for(int j=0;j<marks[l][i].length;j++) {
				   System.out.print(marks[l][i][j]+"  ");
			   }
			   System.out.println(" ");
			   }
			   System.out.println(" ");
		  }
		System.out.println("for each loop starts...");
		for(int s[][]:marks) {
			System.out.println("student : "+count);
			for(int []i:s) {
				
				for(int j:i) {
					 System.out.print( j+"  ");
	               }
		             System.out.println(" ");
				}
			count++;
				
			}
		
		}
	}


