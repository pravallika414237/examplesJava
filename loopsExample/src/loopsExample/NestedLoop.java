package loopsExample;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int count=1;
for(int x=1;x<=3;x++)
 {
        for(int i =1;i<=5;i++)
        {
        	System.out.print(i *x +" ");
	
        }
        System.out.println("");
      

 }
System.out.println("  ");

name1:           //name of the loop
for(int x=1;x<=5;x++)
{
       for(int i =1;i<=x;i++)
       {
       
       	if(x==4) {
       	    continue name1;}
    	System.out.print(i +" ");
       }
       
   System.out.println("");
   

}

}}
