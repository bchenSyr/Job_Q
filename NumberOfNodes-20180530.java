// Created Date: May 30, 2018

/**
 * class ListNode {
 *   public int value;
 *   public ListNode next;
 *   public ListNode(int value) {
 *     this.value = value;
 *     next = null;
 *   }
 * }
 */
 
public class NumberOfNodes {

  // Question: Return the number of nodes in the linked list.
  //  eg: L = null, return 0; L = 1 -> 2 -> null, return 2
  public int numberOfNodes(ListNode head) {
    int num = 0;
    while(head != null) {
      num++;
      head = head.next;
    }
    // exit: head == null
    return num;
  } 
}
