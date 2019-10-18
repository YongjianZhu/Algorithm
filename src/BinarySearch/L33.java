package BinarySearch;

public class L33 {
  public static void main(String[] args) {

  }


  public static int binarySearch(int[] nums, int target) {
    if (nums.length <= 0)
      return -1;

    int start = 0;
    int end = nums.length - 1;
    int mid;

    while (start + 1 < end) {
      mid = start + (end - start) / 2;
      if (nums[mid] == target)
        return mid;
      if (nums[mid] < nums[end]) {
        if (nums[end] >= target && nums[mid] <= target) {
          start = mid;
        } else {
          end = mid;
        }
      }
      if (nums[mid] > nums[end]) {
        if (nums[start] <= target && nums[mid] >= target) {
          end = mid;
        } else {
          start = mid;
        }
      }
    }

    if (nums[start] == target)
      return start;
    if (nums[end] == target)
      return end;
    return -1;

  }
}
