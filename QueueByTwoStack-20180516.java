// Created Date: May 15, 2018
// Question: Implement a queue by using two stacks. 
// 		       The queue should provide size(), isEmpty(), offer(), poll() and peek() operations. 
// 			     When the queue is empty, poll() and peek() should return null.

package myMain;
import java.util.Deque;
import java.util.LinkedList;

public class QueueByTwoStack {
	
	Deque<Integer> inStack = new LinkedList<>();
	Deque<Integer> outStack = new LinkedList<>();
		
	public Integer size() {
		return inStack.size() + outStack.size();
	}
	
	public boolean isEmpty() {
		if(inStack.isEmpty() && outStack.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void offer(int element) {		
		inStack.push(element);	
	}
	
	public Integer poll() {		
		if(outStack.isEmpty()) {
			if(inStack.isEmpty()) {
				return null;
			}
			else {
				while(inStack.isEmpty() == false) {
					outStack.push(inStack.pop());
				}
			}
		}
		return outStack.pop();
	}
	
	public Integer peek() {	
		if(outStack.isEmpty()) {
			if(inStack.isEmpty()) {
				return null;
			}
			else {
				while(inStack.isEmpty() == false) {
					outStack.push(inStack.pop());
				}
			}
		}
		return outStack.peek();
	}

	public static void main(String[] args) {	
		
		QueueByTwoStack myQ = new QueueByTwoStack();
		System.out.println(myQ.isEmpty());
		System.out.println("size = " + myQ.size());
		System.out.println("peek " + myQ.peek());
		
		myQ.offer(1);
		myQ.offer(2);
		System.out.println("peek " + myQ.peek());
		myQ.offer(3);
		System.out.println("peek " + myQ.peek());
		
		System.out.println(myQ.isEmpty());
		System.out.println("peek " + myQ.peek());
		System.out.println("size = " + myQ.size());
		System.out.println("poll: " + myQ.poll());
		System.out.println("size = " + myQ.size());
		System.out.println("peek " + myQ.peek());
		System.out.println("poll: " + myQ.poll());
		System.out.println("poll: " + myQ.poll());
	}
}
