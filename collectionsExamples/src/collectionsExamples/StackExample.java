package collectionsExamples;
import java.util.*;
public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack s= new Stack();
s.push(10);
s.push(20);
s.push(30);
s.push(40);
s.push(50);
s.push(60);
s.push(70);
s.push(80);
s.push(90);
s.push(1000);
System.out.println(s);

Iterator i =s.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
	
	}
System.out.println("pop removes the top value : "+s.pop());
System.out.println("peek reads the top value : "+s.peek());
System.out.println(s);
System.out.println(s.empty());
System.out.println(s.isEmpty());
System.out.println(s.search(90));
System.out.println(s.elementAt(1));

	}

}
