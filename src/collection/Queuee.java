package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queuee {
	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue<>();
		q.add(10);
		q.add(20);
		q.add(30);
		
		System.out.println(q.remove());
		
		System.out.println("Queue elements: "+q);
		System.out.println("Element method->"+q.element());
		//q.clear();
		//System.out.println(q.element());
		System.out.println("peek method->"+q.peek());
		
		System.out.println("Remove method->"+q.remove());
		//q.clear();
		//System.out.println(q.remove());
		System.out.println("Poll method->"+q.poll());
		
	}
}
