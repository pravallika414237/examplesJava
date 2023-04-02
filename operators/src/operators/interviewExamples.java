package operators;

public class interviewExamples {

	public static void main(String[] args) {
	//1	
			  int x = 9, y = 12;
			  int a = 2, b = 4, c = 6;
			 
			   int exp =  10 * (y - 5) * (a + b + c)/x ;
			 
			   System.out.println(exp);
	//2		 
			    x = 9;
			    y = 12;
			    a = 2; b = 4; c = 6;
			 
			    exp = b/3 * (x + 34) ;
			    //if operator prcedence is * , /
			    // then w
			  
			 
			   System.out.println(exp);
	//3
			   x = 20; y = 30;int z = 50; 
			    x += y; 
			    y-= x + z;     // y=y-( x + z); 
			    z *= x * y;       //(50*50*70)
			 System.out.println("x = " +x ); 
			 System.out.println("y = " +y ); 
			 System.out.println("z = " +z );
			   
	}

}
