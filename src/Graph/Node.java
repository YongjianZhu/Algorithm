package Graph;

import java.util.ArrayList;
import java.util.List;

class Node {
  public int val;
  public List<Node> neighbors;

  public Node(int _val) {
    val = _val;
    neighbors = new ArrayList<Node>();
  }
}