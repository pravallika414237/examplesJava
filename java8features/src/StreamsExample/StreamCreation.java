package StreamsExample;

import java.util.stream.Stream;

public class StreamCreation {
public static void main(String [] args) {
	
	Stream<Integer> s= Stream.of(1,30,50,10,8);
	s.forEach(System.out::println);
	// TODO Auto-generated method stub

}
}
