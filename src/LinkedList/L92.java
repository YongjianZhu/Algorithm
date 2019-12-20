package LinkedList;

public class L92 {
  public ListNode reverseBetween(ListNode head, int m, int n) {
    if (m > n || head == null) return null;

    ListNode point = new ListNode(-1);
    point.next = head;
    ListNode flag = point;

    for (int i = 1; i < m; i++) {
      point = point.next;
    }

    ListNode prev = point;
    ListNode mNode = point.next;

    for (int i = 0; i < m-n; i++) {
      ListNode temp = mNode.next;
      mNode.next = prev;

    }

    return null;
  }
}
