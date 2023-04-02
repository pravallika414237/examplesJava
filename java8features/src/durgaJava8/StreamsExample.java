package durgaJava8;
import java.util.*;
import java.util.stream.Collectors;
public class StreamsExample {

	public static void main(String [] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		l.add(52);
		l.add(82);
		l.add(72);
		l.add(89);
		l.add(12);
		l.add(84);
		l.add(51);
		l.add(72);
		
		System.out.println(l);
		
		System.out.println("filter - predicate-boolean");
		l.stream().filter(i -> i>50).collect(Collectors.toList()).forEach(i -> System.out.println(i)); 
		
		System.out.println("map - function-generic");
		l.stream().map(i -> i+50).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("count-");
		System.out.println(l.stream().count());
		
		System.out.println("sort");
		l.stream().sorted().forEach(System.out::println);
		
		Comparator<Integer> c = (o1,o2) -> (o1>o2)?-1:(o1<o2)?1:0;
		
		System.out.println("sort comparator");
		l.stream().sorted(c).forEach(System.out::println);
		
		System.out.println("min, max");
		int firstIsMin = l.stream().min(c).get();
		int lastIsMax = l.stream().max(c).get();
		System.out.println("min is : "+  firstIsMin);  //min - first value
		System.out.println("max is : "+  lastIsMax);  // max- last
		
	}
}
