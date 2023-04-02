package assignment3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test35 {
//
//	public static boolean validate(String s) {
//		boolean flag= false;
//		
//		if(s.length()>=8 && s.endsWith("_job")) {
//			flag= true;
//			
//		}

		//return flag;
	//}
	public static boolean validate(String input) {
		String regrex = "^[A-Za-z]{8,}_job$";
		Pattern p= Pattern.compile(regrex);
		
		if(input==null) {
			return false;
		}
		Matcher m= p.matcher(input);
		return m.matches();
	}
	public static void main(String[] args) {
		
		Scanner sc=  new Scanner(System.in);
		String str ;
		//str=sc.nextLine();
		if(sc.hasNext()) {
		str=sc.nextLine();
		System.out.println(validate(str));
		}
		
		

	}}



//"^[A-Za-z]{8,}_job$"

