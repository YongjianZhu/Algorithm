package LinkedList;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class L23 {
  public ListNode mergeKLists(ListNode[] lists) {
    if (lists.length == 0) return null;

    Queue<ListNode> heap = new PriorityQueue<ListNode>(lists.length, ListNodeComparator);
    for (int i = 0; i < lists.length; i++) {
      if (lists[i] != null) {
        heap.add(lists[i]);
      }
    }

    ListNode dummy = new ListNode(-1);
    ListNode tail = dummy;

    while (!heap.isEmpty()) {
      ListNode head = heap.poll();
      tail.next = head;
      tail = tail.next;
      if (head.next != null) {
        heap.add(head.next);
      }
    }

    return dummy.next;
  }

  private Comparator<ListNode> ListNodeComparator = new Comparator<ListNode>() {
    @Override
    public int compare(ListNode o1, ListNode o2) {
      if (o1 == null) {
        return 1;
      } else if (o2 == null) {
        return -1;
      }
      return o1.val - o2.val;
    }
  };

}
