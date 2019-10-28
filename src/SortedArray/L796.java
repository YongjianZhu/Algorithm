package SortedArray;

public class L796 {
  public static void main(String[] args) {
    System.out.println(rotateString("abcde", "abced"));
  }

  public static boolean rotateString(String A, String B) {
    if (A.length() == 0 && B.length() == 0) return true;
    for (int i = 0; i < A.length(); i++) {
      if (rotate(A, i).equals(B)) return true;
    }
    return false;
  }

  public static String rotate(String str, int offset) {
    if (offset == 0) return str;
    char[] s = str.toCharArray();
    reverse(s, 0, offset - 1);
    reverse(s, offset, s.length - 1);
    reverse(s, 0, s.length - 1);
    return String.valueOf(s);
  }

  public static void reverse(char[] s, int start, int end) {
    for (; start < end; start++, end--) {
      char t = s[start];
      s[start] = s[end];
      s[end] = t;
    }
  }

}
