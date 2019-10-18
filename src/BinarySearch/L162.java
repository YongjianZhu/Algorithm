package BinarySearch;

public class L162 {
  public static void main(String[] args) {

  }

  public static int binarySearch(int[] nums) {
    if (nums.length <= 0)
      return -1;

    int start = 0;
    int end = nums.length - 1;
    int mid;

    while (start < end) {
      mid = start + (end - start) / 2;
      if (nums[mid] > nums[mid + 1]) {
        end = mid;
      } else {
        start = mid + 1;
      }
    }

    return start;
  }
}
