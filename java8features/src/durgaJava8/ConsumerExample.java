package durgaJava8;
import java.util.function.*;
public class ConsumerExample {

	public static void main(String[] args) {
		Consumer <Integer> c = (i) -> System.out.println(i*i);

		c.accept(5);
	}

}
