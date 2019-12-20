package Graph;

import java.util.*;

public class L133 {
  public static Node cloneGraph(Node node) {
    if (node == null) return null;

    ArrayList<Node> nodes = new ArrayList<>();
    nodes.add(node);

    Queue<Node> queue = new LinkedList<>();
    queue.offer(node);

    HashMap<Node, Node> map = new HashMap<>();
    Node copyRoot = new Node(node.val);
    map.put(node, copyRoot);

    while (!queue.isEmpty()) {
      int size = queue.size();
      for(int i = 0; i < size; i ++) {
        Node head = queue.poll();
        for (Node child: head.neighbors) {
          if (nodes.contains(child)) continue;
          nodes.add(child);
          queue.offer(child);
          Node newNode = new Node(child.val);
          map.put(child, newNode);
        }
      }
    }

    for (Node oldNode: nodes) {
      Node newNode = map.get(oldNode);
      for (Node neighbors: oldNode.neighbors) {
        newNode.neighbors.add(map.get(neighbors));
      }
    }

    return map.get(node);
  }

  public static void main(String[] args) {
    Node a = new Node(1);
    Node b = new Node(2);
    Node c = new Node(3);
    a.neighbors.add(b);
    a.neighbors.add(c);
    b.neighbors.add(a);
    b.neighbors.add(c);
    c.neighbors.add(a);
    c.neighbors.add(b);

    cloneGraph(a);
  }
}
