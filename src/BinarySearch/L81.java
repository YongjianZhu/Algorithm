package BinarySearch;

public class L81 {
  public static void main(String[] args) {

  }

  public boolean search(int[] nums, int target) {
    if (nums.length <= 0)
      return false;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target)
        return true;
    }

    return false;
  }
}
