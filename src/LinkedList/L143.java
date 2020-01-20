package LinkedList;

public class L143 {
  public void reorderList(ListNode head) {
    if (head == null) return;
    ListNode mid = findMid(head);
    ListNode tail = reverse(mid.next);
    mid.next = null;

    ListNode dummy = new ListNode(-1);
    ListNode node = dummy;

    boolean left = true;
    while (head != null || tail != null) {
      if (left) {
        node.next = head;
        head = head.next;
        left = false;
      } else {
        node.next = tail;
        tail = tail.next;
        left = true;
      }
      node = node.next;
    }
  }

  public static ListNode findMid(ListNode head) {
    ListNode slow = head;
    ListNode fast = head.next;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public static ListNode reverse(ListNode head) {
    ListNode prev = null;
    while (head != null) {
      ListNode temp = head.next;
      head.next = prev;
      prev = head;
      head = temp;
    }
    return prev;
  }
}
