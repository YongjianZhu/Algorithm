package Graph;

import java.util.ArrayList;
import java.util.List;

public class L51 {
  public List<List<String>> solveNQueens(int n) {
    List<List<String>> result = new ArrayList<>();
    if (n<=0) return result;
    ArrayList<Integer> cols = new ArrayList<Integer>();
    dfs(result, cols, n);
    return result;
  }

  public static void dfs(List<List<String>> result,
                         ArrayList<Integer> cols, int n) {
    if (cols.size() == n) {
      result.add(draw(cols));
      return;
    }

    for (int col = 0; col < n; col++) {
      if (isValid(cols, col)) {
        cols.add(col);
        dfs(result, cols, n);
        cols.remove(cols.size() - 1);
      }
    }
  }

  public static ArrayList<String> draw(ArrayList<Integer> cols) {
    ArrayList<String> board = new ArrayList<String>();

    for (int row = 0; row < cols.size(); row++) {
      String s = "";
      for (int col = 0; col < cols.size(); col++) {
        if (col == cols.get(row)) {
          s += "Q";
        } else {
          s += ".";
        }
      }
      board.add(s);
    }
    return board;
  }

  public static boolean isValid(ArrayList<Integer> cols, int col) {
    int row = cols.size();
    for (int i = 0; i < cols.size(); i++) {
      if (cols.get(i) == col) {
        return false;
      }
      if (row + col == i + cols.get(i)) {
        return false;
      }
      if (row - col == i - cols.get(i)) {
        return false;
      }
    }
    return true;
  }
}
