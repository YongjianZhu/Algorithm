package DynamicProgramming;

public class L64 {
  public int minPathSum(int[][] grid) {
    if (grid != null || grid.length ==0)
      return -1;

    int colSize = grid[0].length;
    int rowSize = grid.length;
    int[][] m = new int[rowSize][colSize];

    m[0][0] = grid[0][0];

    for (int i = 1; i < colSize; i++)
      m[0][i] = m[0][i - 1] + grid[0][i];

    for (int i = 1; i < rowSize; i++)
      m[i][0] = m[i - 1][0] + grid[i][0];

    for (int i = 1; i < rowSize; i++) {
      for (int j = 1; j < colSize; j++) {
        m[i][j] = Math.min(m[i - 1][j], m[i][j - 1]) + grid[i][j];
      }
    }

    return m[rowSize - 1][colSize - 1];
  }
}
