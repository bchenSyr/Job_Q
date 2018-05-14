// Created Date: May 14, 2018
// Application: practice reverse LinkedList recursively and iteratively

package myMain;

public class MainClass {
		
	//Time Complexity: O(n);
	//Space Complexity: O(1);
	public static ListNode IterativeReverse(ListNode head) {
				
		ListNode prev = null;
		ListNode curr = head;
		ListNode next = null;
		
		while(curr != null) {			
			
			next = curr.next;
			curr.next = prev;		
			
			prev = curr;	
			curr = next;						
		}			
		return prev;
	}
	
	//Time Complexity: O(n);
	//Space Complexity: O(1);
	public static ListNode RecursiveReverse(ListNode head) {
		
		if(head == null || head.next == null) return head;
		
		ListNode newHead = RecursiveReverse(head.next);
		
		ListNode node = head.next;
		node.next = head;
		head.next = null;
				
		return newHead;
	}
	
	
	public static void printList(ListNode head) {
		ListNode curr = head;
		
		while(curr != null) {
			System.out.print(curr.value +" ");
			curr = curr.next;
		}		
		System.out.print("\n");
	}
	
	public static void main(String[] args) {	
				
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		
		ListNode newhead  = RecursiveReverse(head);
		printList(newhead);
		
		newhead = IterativeReverse(newhead);
		printList(newhead);

	}
}
