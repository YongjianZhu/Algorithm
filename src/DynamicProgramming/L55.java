package DynamicProgramming;

public class L55 {
  public boolean canJump(int[] nums) {
    if (nums == null || nums.length == 0)
      return false;

    boolean[] dp = new boolean[nums.length];
    dp[0] = true;

    for (int i = 0; i < nums.length; i++) {
      if (dp[i]) {
        for (int j = 1; j < nums[i] && i + j < nums.length; j++) {
          dp[i + j] = true;
        }
      }
    }

    return dp[nums.length - 1];
  }
}
