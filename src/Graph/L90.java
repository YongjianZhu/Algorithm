package Graph;

import java.util.*;

public class L90 {
  public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();
    List<Integer> sortedNums = new ArrayList<>();
    for (int i : nums) sortedNums.add(i);
    Collections.sort(sortedNums);
    dfs(result, subset, sortedNums, 0);
    return result;
  }

  public void dfs(List<List<Integer>> result,
                  List<Integer> subset, List<Integer> nums, int position) {

      result.add(new ArrayList<>(subset));

    for (int i = position; i < nums.size(); i++) {
      if (i != position && nums.get(i) == nums.get(i-1)) continue;
      subset.add(nums.get(i));
      dfs(result, subset, nums, i + 1);
      subset.remove(subset.size() - 1);
    }
  }
}
