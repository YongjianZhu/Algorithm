package LinkedList;

public class L82 {
  public ListNode deleteDuplicates(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

    ListNode point = new ListNode(-1);
    point.next = head;
    ListNode flag = point;

    while (point.next != null && point.next.next != null) {
      if (point.next.val == point.next.next.val) {
        int val = point.next.val;
        while (point.next != null && point.next.val == val)
          point.next = point.next.next;
      } else {
        point = point.next;
      }
    }

    return flag.next;
  }
}
