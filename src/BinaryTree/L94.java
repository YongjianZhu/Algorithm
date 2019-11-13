package BinaryTree;

import java.util.ArrayList;

public class L94 {
  public void inorder(TreeNode root, ArrayList<Integer> result) {
    if (root == null) return;

    inorder(root.left, result);
    result.add(root.val);
    inorder(root.right, result);
  }
}
