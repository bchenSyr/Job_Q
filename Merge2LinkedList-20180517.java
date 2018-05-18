// Created Date: May 17, 2018
// Application: Practice merge two sorted LinkedList

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
	}	
}

/* Alt Test Case 0:
 * 
 * ListNode head = null;
 * printList(head);
 * ListNode head2 = null;
 * printList(head2);
 * 
 * ListNode newhead = merge(head, head2);
 * printList(newhead);
 * 
 * */

/* Alt Test Case 1:
 * 
 * ListNode head = new ListNode(0);
 * printList(head);
 * ListNode head2 = null;
 * printList(head2);
 * 
 * ListNode newhead = merge(head, head2);
 * printList(newhead);
 * 
 * */


