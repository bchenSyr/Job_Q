// Created Date: May 14, 2018
// Application: Practice reversing LinkedList

// Updated: May 17, 2018: 
// merge() - merge two sorted LinkedList
// insert() - Insert In Sorted Linked List

package myMain;

class ListNode {
	
	int value;
	ListNode next = null;
	
	public ListNode(int v) {
		this.value = v;
		this.next = null;
	}
}

public class LinkedList {
	
	//Time Complexity: O(n);
	//Space Complexity: O(1);
	public static ListNode myInsert(ListNode head, int value) {
		
		ListNode newNode = new ListNode(value);
		ListNode curr = head;
		
		if(curr == null) {
			head = newNode;
			return head;
		}
		else if(curr.value >= value) {
			newNode.next = head;
			head = newNode;
			return head;
		}
		else {		
			while(curr != null) {
				if(curr.next == null || curr.next.value >= value) {
					ListNode next = curr.next;
					curr.next = newNode;
					newNode.next = next;
					return head;
				}
				curr = curr.next;
			}
			return head;
		}			
	}
		
	//Time Complexity: ? O(size1+size2)
	//Space Complexity: O(1);
	public static ListNode merge(ListNode one, ListNode two) {
		
		if(one == null && two == null) return null;
		
		ListNode dummyHead = new ListNode(-1);
		ListNode curr = dummyHead;
		
		ListNode ptrOne = one;
		ListNode ptrTwo = two;
		
		while(ptrOne != null || ptrTwo != null) {
					
			if(ptrOne == null) {
				curr.next = ptrTwo;
				break;
			}
			else if(ptrTwo == null) {
				curr.next = ptrOne;
				break;
			}
			else if(ptrOne.value <= ptrTwo.value) {
				curr.next = ptrOne;
				ptrOne = ptrOne.next;
			}
			else {
				curr.next = ptrTwo;
				ptrTwo = ptrTwo.next;
			}
			curr = curr.next;
		}
					
		return dummyHead.next;
	}
		
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
	
	//Time Complexity: O(n);
	//Space Complexity: O(1);
	public static void printList(ListNode head) {
		if(head == null) {
			System.out.print("null \n");
			return;
		}
		
		ListNode curr = head;
		
		while(curr != null) {
			System.out.print(curr.value +" ");
			curr = curr.next;
		}		
		System.out.print("\n");
	}
		
	public static void main(String[] args) {	
		
		ListNode newhead;
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(3);
		head.next.next = new ListNode(5);
		head.next.next.next = new ListNode(7);
		head.next.next.next.next = new ListNode(9);
		printList(head);
		
		newhead  = RecursiveReverse(head);
		printList(newhead);
		
		newhead = IterativeReverse(newhead);
		printList(newhead);
		
		ListNode head2 = new ListNode(2);;
		head2.next = new ListNode(4);
		head2.next.next = new ListNode(6);
		head2.next.next.next = new ListNode(8);
		head2.next.next.next.next = new ListNode(10);
		printList(head2);
		
		newhead = merge(head, head2);
		printList(newhead);
		
		newhead = myInsert(newhead, 20);
		printList(newhead);
		
		newhead = myInsert(newhead, 0);
		printList(newhead);
		
		newhead = myInsert(newhead, 6);
		printList(newhead);
	}	
}
