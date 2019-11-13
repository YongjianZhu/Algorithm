package BinaryTree;

import java.util.*;

public class L107 {
  public static void main(String[] args) {

  }

  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    ArrayList result = new ArrayList();

    if (root == null) {
      return result;
    }

    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.offer(root);

    while (!queue.isEmpty()) {
      ArrayList<Integer> level = new ArrayList<Integer>();
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode head = queue.poll();
        level.add(head.val);

        if (head.left != null) {
          queue.offer(head.left);
        }

        if (head.right != null) {
          queue.offer(head.right);
        }
      }
      result.add(level);
    }
    Collections.reverse(result);

    return result;
  }
}
