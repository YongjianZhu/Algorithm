package LinkedList;

public class L148 {
  public ListNode sortList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

    ListNode mid = findMid(head);
    ListNode node1 = sortList(head);
    ListNode node2 = sortList(mid);
    return merge(node1, node2);
  }

  public ListNode findMid(ListNode head) {
    ListNode slow = head;
    ListNode fast = head.next;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    ListNode result = slow.next;
    slow.next = null;
    return result;
  }


  public ListNode merge(ListNode head1, ListNode head2) {
    ListNode dummy = new ListNode(-1);
    ListNode tail = dummy;

    while (head1 != null & head2 != null) {
      if (head1.val < head2.val) {
        tail.next = head1;
        head1 = head1.next;
      } else {
        tail.next = head2;
        head2 = head2.next;
      }
      tail = tail.next;
    }

    if (head1 != null) {
      tail.next = head1;
    }
    if (head2 != null) {
      tail.next = head2;
    }

    return dummy.next;
  }
}
