package LinkedList;

public class L109 {
  ListNode current;

  public TreeNode sortedListToBST(ListNode head) {
    if (head == null) return null;

    current = head;

    TreeNode t = helper(getListLength(head));
    return t;
  }

  public int getListLength(ListNode head) {
    int len = 0;
    while (head != null) {
      head = head.next;
      len++;
    }
    return len;
  }

  public TreeNode helper(int size) {
    if (size == 0) return null;

    TreeNode left = helper(size / 2);
    TreeNode root = new TreeNode(current.val);
    current = current.next;
    TreeNode right = helper(size - 1 - size / 2);
    root.left = left;
    root.right = right;
    return root;
  }

}
