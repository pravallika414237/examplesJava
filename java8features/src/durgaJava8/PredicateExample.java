package durgaJava8;
import java.util.function.*;
public class PredicateExample {

	public static void main(String[] args) {
		
		//Predicate Inner class
		Predicate<Integer> p = new Predicate<>() {
            
			@Override
			public boolean test(Integer t) {
		
				return t%2==0;
		}};
		
		System.out.println(p.test(89));

		//lamda Predicate
		Predicate<String> pre  = s -> s.length()>5;
		
		System.out.println(pre.test("pravallik"));
}}
