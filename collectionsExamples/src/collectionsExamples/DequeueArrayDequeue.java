package collectionsExamples;
import java.util.*;
public class DequeueArrayDequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Deque q= new ArrayDeque();
q.add("hi");
q.add(95);
q.add(195);
q.add("hello");
q.add(925);
q.add(995);

System.out.println(q);
System.out.println(q.peekFirst());
System.out.println(q.peekLast());
System.out.println(q.peek());
System.out.println(q);
System.out.println(q.poll());
System.out.println(q.pollFirst());
System.out.println(q.pollLast());
System.out.println(q);
System.out.println(q.pop());
System.out.println(q);
//Queue Interface is implemented using ArrayDeque,LinkedList and PriorityQueue
//Dequeue Interface is impleted using ArrayDeque and LinkedList
	}

}
