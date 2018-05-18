// Created Date: May 17, 2018
// Question: Enhance the stack implementation to support min() operation. 
// min() should return the current minimum value in the stack. 
// If the stack is empty, min(), top() should return -1.

package myMain;
import java.util.Deque;
import java.util.LinkedList;

public class StackWithMinOp {
	
	Deque<Integer> stack;
	Deque<Integer> minStack; 
	
	public StackWithMinOp() {
		stack = new LinkedList<>();
		minStack = new LinkedList<>();
	}
	
	public int pop() {
		if(stack.size() == 0) return -1;
		
		if(stack.peek() == minStack.peek()) {
			minStack.pop();
		}		
		return stack.pop();
	}
	
	public void push(int element) {
			
		if(stack.size() == 0) {			
			minStack.push(element);
		}
		else {			
			if(element <= minStack.peek()) {
				minStack.push(element);
			}
		}
		stack.push(element);	
	}
	  
	public int top() {
		if(stack.size() == 0) return -1;		
		return stack.peek();
	}
	  	    
	public int min() {
		if(stack.size() == 0) return -1;	
		return minStack.peek();
	}
	  	  
	public static void main(String[] args) {
			
		StackWithMinOp stack = new StackWithMinOp();
		stack.push(1);
		stack.push(2);
		stack.push(2);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack.top());
		System.out.println(stack.min());

		stack.pop();
		System.out.println(stack.top());
		stack.pop();
		System.out.println(stack.min());
		stack.pop();
		System.out.println(stack.min());
	}
}
