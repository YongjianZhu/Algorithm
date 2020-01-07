package Graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L40 {
  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> results = new ArrayList<>();
    List<Integer> set = new ArrayList<>();
    List<Integer> sortedCandidates = new ArrayList<>();
    for (int i : candidates) {
      sortedCandidates.add(i);
    }
    Collections.sort(sortedCandidates);
    dfs(results, set,0, sortedCandidates, target);
    return results;
  }

  public static void dfs(List<List<Integer>> results,
                         List<Integer> set,int position,
                         List<Integer> sortedCandidates, int target) {
    if (target == 0) {
      results.add(new ArrayList<>(set));
      return;
    }

    for (int i = position; i < sortedCandidates.size(); i++) {
      if (sortedCandidates.get(i) > target) break;
      if (i != position && sortedCandidates.get(i) == sortedCandidates.get(i - 1)) continue;
      set.add(sortedCandidates.get(i));
      dfs(results, set, i + 1, sortedCandidates, target - sortedCandidates.get(i));
      set.remove(set.size() - 1);
    }
  }
}
