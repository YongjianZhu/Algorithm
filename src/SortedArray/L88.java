package SortedArray;

public class L88 {
  public static void main(String[] args) {
    int[] nums1 = {0};
    int[] nums2 = {2};
    merge(nums1, 0, nums2, 1);
    for (int i = 0; i < nums1.length; i++)
      System.out.println(nums1[i]);
  }

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    m--;
    n--;
    int newArrayCurrentIndex = nums1.length - 1;
    while (n >= 0) nums1[newArrayCurrentIndex--] = (m >= 0 && nums1[m] >= nums2[n]) ? nums1[m--] : nums2[n--];
  }
}
