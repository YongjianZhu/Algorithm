package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class L98 {
  public static void main(String[] args) {

  }

  public boolean isValidBST(TreeNode root) {

    return false;
  }

  public void inOrderTraverse(TreeNode root, ArrayList result) {
    if (root == null) return;
    inOrderTraverse(root.left, result);
    result.add(root.val);
    inOrderTraverse(root.right, result);
  }
}
