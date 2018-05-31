/* 
*
* Created Date: May 31, 2018
*
* Questiong: Insert a new element at a specific index in the given linked list. 
*            The index is 0 based, and if the index is out of the list's scope, you do not need to do anything.
*   Examples: 1 -> 2 -> 3 -> null, insert 4 at index 3, --> 1 -> 2 -> 3 -> 4 -> null
*             1 -> 2 -> null, insert 4 at index 0, --> 4 -> 1 -> 2 -> null
*
*/

public class LLInsertAtIndex {
  public ListNode insert(ListNode head, int index, int value) {
    
    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;
    ListNode newNode = new ListNode(value);
    ListNode ptr = head;
    
    while(index > 0 && ptr != null){
      curr.next = ptr;
      ptr = ptr.next;
      curr = curr.next;
      index--;
    }
    
    if(index > 0) return head; // the index is out of the list's scope, do anything.
    
    curr.next = newNode;
    newNode.next = ptr;
    return dummy.next;
  }
}
