package basicpackage;

public class TwoDArray {

	public static void main(String[] args) {
		int []a = null;
		int[] stu1= {23,48,90,78,23};
		int[] stu2= {84,98,85,71,84};
		int[] stu3= {87,85,84,74,85};
		
		for(int i=0;i<stu1.length;i++) {
			System.out.println( stu1[i]+"  "+stu2[i]+"  "+stu3[i]);
//			System.out.println(a);
		}
		
int [][] students= {stu1,stu2,stu3};
System.out.println("foreach loop starts...");
   for(int []i:students) 
   {
	  // System.out.println("reading the new th row");
	   
	             for(int j:i)
	           {
	                 System.out.print( j+"  ");
               }
	             System.out.println(" ");
  }
   
   System.out.println("for loop starts...");
  for(int i=0;i<students.length;i++) {
	   for(int j=0;j<students[i].length;j++) {
		   System.out.print(students[i][j]+"  ");
		  
	   }
	   System.out.println(" ");
  }
   
  
   
	}

}
