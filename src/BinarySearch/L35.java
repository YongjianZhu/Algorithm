package BinarySearch;

// O(log N)
public class L35 {
  public static void main(String[] args) {
    int[] nums = {1, 3, 5, 6};
    System.out.println(searchInsert(nums, 0));
  }

  public static int searchInsert(int[] nums, int target) {
    return binarySearch(nums, target);
  }

  //  find the first element >= target
  public static int binarySearch(int[] arr, int target) {
    if (arr.length == 0) {
      return 0;
    }

    int start = 0;
    int end = arr.length - 1;
    int mid;

    while (start + 1 < end) {
      mid = start + (end - start) / 2;
      if (arr[mid] == target) {
//        no duplicate number
        return mid;
      } else if (arr[mid] > target) {
        end = mid;
      } else if (arr[mid] < target) {
        start = mid;
      }
    }

    if (arr[start] >= target) {
      return start;
    }
    if (arr[end] >= target) {
      return end;
    } else {
      return arr.length;
    }
  }
}
