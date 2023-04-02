package collectionsExamples;
import java.util.*;
public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Queue q1= new PriorityQueue();
  q1.add(988);
  q1.add(288);
  q1.add(849);
  q1.add(888);
  q1.add(45);
  
  Iterator i = q1.iterator();
  
  while(i.hasNext()) {
	  System.out.println(i.next());
  }
  
  System.out.println("printing the queue : "+ q1);
	
  System.out.println("peek value :" +q1.peek());
  System.out.println(q1);
  System.out.println("poll value : "+ q1.poll());
  System.out.println(q1);
	}

}
