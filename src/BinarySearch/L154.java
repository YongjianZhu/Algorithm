package BinarySearch;

public class L154 {
  public static void main(String[] args) {

  }

  public static int minRotatedArrary(int[] nums) {
    if (nums.length <= 0)
      return -1;

    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] > nums[i + 1])
        return nums[i + 1];
    }

    return nums[0];
  }
}
