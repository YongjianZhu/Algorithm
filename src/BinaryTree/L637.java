package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L637 {

  public List<Double> averageOfLevels(TreeNode root) {
    ArrayList result = new ArrayList();
    if (root == null)
      return result;

    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.offer(root);

    while (!queue.isEmpty()) {
      double sum = 0;
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode head = queue.poll();
        sum += head.val;

        if (head.left != null) {
          queue.offer(head.left);
        }
        if (head.right != null) {
          queue.offer(head.right);
        }

      }

      result.add(sum / size);
    }
    return result;
  }

}
