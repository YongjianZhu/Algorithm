package LinkedList;

import java.util.HashMap;

class Node {
  int val;
  Node next;
  Node random;

  public Node(int val) {
    this.val = val;
    this.next = null;
    this.random = null;
  }
}

public class L138 {
  public Node copyRandomList(Node head) {
    if (head == null) return null;
    Node origCur = head;
    Node copyHead = new Node(-1);
    Node copyCur = copyHead;

    HashMap<Node, Node> map = new HashMap<>();
    while (origCur != null) {
      Node copy = new Node(origCur.val);
      map.put(origCur, copy);
      copyCur.next = copy;
      copyCur = copyCur.next;
      origCur = origCur.next;
    }

    origCur = head;
    copyCur = copyHead.next;
    while (origCur != null) {
      Node copyRandom = map.get(origCur.random);
      copyCur.random = copyRandom;
      copyCur = copyCur.next;
      origCur = origCur.next;
    }

    return map.get(head);
  }
}
