package LinkedList;

import java.util.List;

public class L86 {
  public static ListNode partition(ListNode head, int x) {
    ListNode less = new ListNode(-1);
    ListNode greater = new ListNode(-1);

    ListNode lessCurrent = less;
    ListNode greaterCurrent = greater;

    while (head!= null) {
      ListNode next = head.next;
      if (head.val < x) {
        lessCurrent.next = head;
        lessCurrent = head;
      } else  {
        greaterCurrent.next = head;
        greaterCurrent = head;
      }
      head = next;
    }

    greater.next = null;
    lessCurrent.next = greater.next;

    return less.next;
  }

  public static void main(String[] args) {
    ListNode n1 = new ListNode(1);
    ListNode n4 = new ListNode(4);
    ListNode n3 = new ListNode(3);
    ListNode n2 = new ListNode(2);
    ListNode n5 = new ListNode(5);
    ListNode n6 = new ListNode(2);

    n1.next = n4;
    n4.next = n3;
    n3.next = n2;
    n2.next = n5;
    n5.next = n6;

    partition(n1, 3);

    ListNode n = n1;
    int i = 0;
    while (n != null && i < 30) {
      System.out.println(n.val);
      n = n.next;
      i++;
    }
  }
}
