package Graph;

import java.util.ArrayList;
import java.util.List;

public class L78 {
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    ArrayList<Integer> subset = new ArrayList<>();

    dfs(result, subset, nums, 0);
    return result;
  }

  public static void dfs(List<List<Integer>> result,
                         ArrayList<Integer> subset,
                         int[] nums, int position) {
    result.add(new ArrayList<>(subset));

    for (int i = position; i < nums.length; i++) {
      subset.add(nums[i]);
      dfs(result, subset, nums, i + 1);
      subset.remove(subset.size() - 1);
    }
  }
}
