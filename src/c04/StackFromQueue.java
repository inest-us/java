package c04;

import java.util.LinkedList;
import java.util.Queue;

public class StackFromQueue {
	private Queue<Integer> queue1;
	private Queue<Integer> queue2;

	StackFromQueue() {
		queue1 = new LinkedList<Integer>();
		queue2 = new LinkedList<Integer>();
	}
	
	void push(int data) {
		Queue<Integer> enqueue = queue1.isEmpty() ? queue1 : queue2;
		Queue<Integer> dequeue = queue1.isEmpty() ? queue2 : queue1;
		
		enqueue.add(data);
		while (!dequeue.isEmpty()) {
			enqueue.add(dequeue.poll());
		}
	}
	
	Integer peek() {
		return !queue1.isEmpty() ? queue1.peek() : queue2.peek();
	}
	
	Integer pop() {
		return !queue1.isEmpty() ? queue1.poll() : queue2.poll();
	}
}
