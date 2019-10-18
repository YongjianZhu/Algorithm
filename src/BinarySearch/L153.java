package BinarySearch;

public class L153 {
  public static void main(String[] args) {

  }

  public static int binarySearch(int[] nums) {
    if (nums.length <= 0)
      return -1;

    int start = 0;
    int end = nums.length - 1;
    int mid;

    while (start + 1 < end) {
      mid = start + (end - start) / 2;
      if (nums[mid] > nums[end]) {
        start = mid;
      } else {
        end = mid;
      }
    }

    if (nums[start] < nums[end]) {
      return nums[start];
    }
    return nums[end];
  }
}
