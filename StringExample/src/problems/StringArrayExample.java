package problems;

public class StringArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] s = {"i","am","java","string"};

int []a= {1,2,3,4,5};

try {
for(int i=0;i<=5;i++) {
	System.out.println(s[i]);
	System.out.println(a[i]/0);
}
}
// not sure what error occurs
//catch(Exception i)
//{
//	System.out.println(i.getMessage());
//	System.out.println(i);
//	} 

catch(IndexOutOfBoundsException i) {
	System.out.println(i.getMessage());
	System.out.println(i);
}
catch(Exception e) {
	System.out.println(e);
}
System.out.println("completed");


	}}


