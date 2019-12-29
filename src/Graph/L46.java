package Graph;

import java.util.ArrayList;
import java.util.List;

public class L46 {
  public static List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    if (nums == null || nums.length == 0) {
      return null;
    }

    ArrayList<Integer> list = new ArrayList<Integer>();
    dfs(result, list, nums);
    List<List<Integer>> r = result;
    return result;
  }

  public static void dfs(List<List<Integer>> result,
                         ArrayList<Integer> list,
                         int[] nums) {
    if (list.size() == nums.length) {
      result.add(new ArrayList<Integer>(list));
      return;
    }

    for (Integer num : nums) {
      if (!list.contains(num)) {
        list.add(num);
        dfs(result, list, nums);
        list.remove(list.size() - 1);
      }
    }
  }

}
