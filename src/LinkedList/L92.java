package LinkedList;

public class L92 {
  public ListNode reverseBetween(ListNode head, int m, int n) {
    if (head == null || m > n) return null;

    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode current = dummy;

    for (int i = 0; i < m - 1; i++) {
      current = current.next;
    }

    ListNode prev = current;
    ListNode mNode = current.next;
    ListNode node = current.next;

    for (int i = m; i <= n; i ++) {
      ListNode next = node.next;
      node.next = prev;
      prev = node;
      node = next;
    }

    current.next = prev;
    mNode.next = node;

    return dummy.next;
  }
}
