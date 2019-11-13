package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class L98 {
  public static void main(String[] args) {

  }

  public boolean isValidBST(TreeNode root) {
    if (root == null) return true;
    ArrayList<Integer> inorderList = new ArrayList<Integer>();
    inorder(root, inorderList);
    for (int i = 0; i < inorderList.size()-1; i++) {
      if (inorderList.get(i) >= inorderList.get(i+1))
        return false;
    }

    return true;
  }

  public void inorder(TreeNode root, ArrayList<Integer> result) {
    if (root == null) return;
    inorder(root.left, result);
    result.add(root.val);
    inorder(root.right, result);
  }
}
