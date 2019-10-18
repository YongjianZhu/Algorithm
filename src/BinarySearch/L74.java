package BinarySearch;

public class L74 {
  public static void main(String[] args) {
    int[][] m = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
    System.out.println(searchMatrix(m, 13));
  }

  public static boolean searchMatrix(int[][] matrix, int target) {
    if (matrix == null || matrix.length == 0) {
      return false;
    }
    int[] firstColumn = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      firstColumn[i] = matrix[i][0];
    }
    int row = binarySearchRow(firstColumn, target);
    if (row == -1)
      return false;
    int col = binarySearchColumn(matrix[row], target);
    if (col == -1) {
      return false;
    }
    return true;
  }

  public static int binarySearchRow(int[] arr, int target) {
    if (arr.length == 0) {
      return -1;
    }
    int start = 0;
    int end = arr.length - 1;
    int mid;

    while (start + 1 < end) {
      mid = start + (end - start) / 2;
      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] > target) {
        end = mid;
      } else if (arr[mid] < target) {
        start = mid;
      }
    }

    if (arr[end] <= target) {
      return end;
    }
    if (arr[start] <= target) {
      return start;
    }
    return -1;
  }

  public static int binarySearchColumn(int[] arr, int target) {
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
}
