package basicpackage;
import java.util.*;
public class InputArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
int []a;
int i=0;
int n;
System.out.println("Enter size of the array : ");
n=Integer.parseInt(s.nextLine());

 a = new int[n];

for(int c:a) {
	System.out.println("Enter the array numbers : ");
	a[i]=Integer.parseInt(s.nextLine());
	i++;
}
for(int c:a) {
	System.out.println(c);
}

	}
	

}
