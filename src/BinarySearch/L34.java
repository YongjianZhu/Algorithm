package BinarySearch;

import java.util.Arrays;

// O(log N)
public class L34 {
  public static void main(String[] args) {
    int[] nums = {1, 2, 2, 4, 5, 5, 5, 9};
    System.out.println(Arrays.toString(searchRange(nums, 5)));
  }

  public static int[] searchRange(int[] nums, int target) {
    int[] result = {-1, -1};
    result[0] = binarySearchLeft(nums, target);
    result[1] = binarySearchRight(nums, target);
    return result;
  }

  public static int binarySearchLeft(int[] arr, int target) {
    if (arr.length == 0) {
      return -1;
    }

    int start = 0;
    int end = arr.length - 1;
    int mid;

    while (start + 1 < end) {
      mid = start + (end - start) / 2;
      if (arr[mid] == target) {
        end = mid;
      } else if (arr[mid] > target) {
        end = mid;
      } else if (arr[mid] < target) {
        start = mid;
      }
    }

    if (arr[start] == target) {
      return start;
    }
    if (arr[end] == target) {
      return end;
    }

    return -1;
  }

  public static int binarySearchRight(int[] arr, int target) {
    if (arr.length == 0) {
      return -1;
    }

    int start = 0;
    int end = arr.length - 1;
    int mid;

    while (start + 1 < end) {
      mid = start + (end - start) / 2;
      if (arr[mid] == target) {
        start = mid;
      } else if (arr[mid] > target) {
        end = mid;
      } else if (arr[mid] < target) {
        start = mid;
      }
    }

    if (arr[end] == target) {
      return end;
    }
    if (arr[start] == target) {
      return start;
    }

    return -1;
  }

}
