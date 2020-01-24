package LinkedList;



public class L108 {
  public TreeNode sortedArrayToBST(int[] nums) {
    if (nums.length == 0) return null;
    TreeNode node = buildTree(nums,0, nums.length - 1);
    return node;
  }

  public static TreeNode buildTree(int[] nums, int start, int end) {
    if (start > end) return null;
    TreeNode node = new TreeNode(nums[(start + end) / 2]);
    node.left = buildTree(nums, start, (start + end) / 2 - 1);
    node.right = buildTree(nums, (start + end) / 2 + 1, end);
    return node;
  }
}
