package BinarySearch;

public class L278 {
  public static void main(String[] args) {

  }

  public static int firstBadVersion(int n) {
    if (n <= 0)
      return -1;

    int start = 1;
    int end = n;
    int mid;

    while (start + 1 < end) {
      mid = start + (end - start) / 2;
      if (isBadVersion(mid)) {
        end = mid;
      } else {
        start = mid;
      }
    }

    if (isBadVersion(start)) {
      return start;
    }
    return end;
  }

  //  get rid of error
  public static boolean isBadVersion(int n) {
    return true;
  }
}
