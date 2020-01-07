package Graph;

import java.util.ArrayList;
import java.util.List;

public class L131 {
  public static List<List<String>> partition(String s) {
    List<List<String>> result = new ArrayList<List<String>>();
    List<String> set = new ArrayList<String>();
    dfs(result, set, s, 0);
    return result;
  }

  public static boolean isPalindrome(String s) {
    for (int start = 0, end = s.length() - 1; start < end; start++, end--) {
      if (s.charAt(start) != s.charAt(end)) return false;
    }
    return true;
  }

  public static void dfs(List<List<String>> result,
                  List<String> set, String s, int position) {
    if (position == s.length()) {
      result.add(new ArrayList<String>(set));
      return;
    }

    String subStr = "";
    for (int i = position; i < s.length(); i++) {
      subStr += s.charAt(i);
      if (isPalindrome(subStr)) {
        set.add(subStr);
        dfs(result, set, s, i + 1);
        set.remove(set.size() - 1);
      }
    }
  }

  public static void main(String[] args) {
    partition("aab");
  }
}
