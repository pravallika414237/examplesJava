package collectionsExamples;
import java.util.*;

public class QueueExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue  <String> p = new PriorityQueue<>();
//q1.add(988);
//q1.add(288);
//q1.add(849);
//q1.add(888);
p.add("45");
p.add("hello ");
p.add("89");
p.add("java");

p.add("96");
p.add("satya");
p.add("5");

p.add("bcv");
p.add("yuj");
p.add("poojjoij");
p.add("wekm");
p.offer("ki");
//System.out.println(p);

Iterator i = p.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}
	}

}
