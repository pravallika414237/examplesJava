package collectionsExamples;
import java.util.*;


public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <String> l = new ArrayList <String> ()  ;
l.add("hello welcome");
l.add("java");
l.add("html");
l.add("python");

l.forEach(n -> {System.out.println(n);});
	}

}
