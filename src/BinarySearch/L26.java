package BinarySearch;

public class L26 {
  public static void main(String[] args) {

  }

  public int removeDuplicates(int[] nums) {
    if (nums.length == 0 || nums.length == 1) {
      return nums.length;
    }

    int prev = 0;
    for (int i = 1; i < nums.length; i++) {
      if (nums[prev] != nums[i]) {
        nums[++prev] = nums[i];
      }
    }
    return prev+1;

  }
}
