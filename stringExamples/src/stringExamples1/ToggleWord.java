package stringExamples1;

public class ToggleWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= "hello how Are YoU WELCOMe";
String toggle="";
String [] words = s.split(" ");

for(String s1 : words)
{
	String s2 = s1.substring(0, 1);
	String s3 = s1.substring(1);
	
	toggle=  s2.toLowerCase()+s3.toUpperCase()+" " +toggle;
	
}
String s4 =toggle.trim();
System.out.println(s4);

	}

	
	
}
