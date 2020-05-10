//一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
//
// 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
//
// 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
//
//
//
// 网格中的障碍物和空位置分别用 1 和 0 来表示。
//
// 说明：m 和 n 的值均不超过 100。
//
// 示例 1:
//
// 输入:
//[
//  [0,0,0],
//  [0,1,0],
//  [0,0,0]
//]
//输出: 2
//解释:
//3x3 网格的正中间有一个障碍物。
//从左上角到右下角一共有 2 条不同的路径：
//1. 向右 -> 向右 -> 向下 -> 向下
//2. 向下 -> 向下 -> 向右 -> 向右
//
// Related Topics 数组 动态规划


//leetcode submit region begin(Prohibit modification and deletion)
class LeetCode_63_0206 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid==null || obstacleGrid.length==0) {
            return 0;
        }
        int width = obstacleGrid[0].length;
        int[] dp = new int[width];
        dp[0] = 1;

        for (int[] row : obstacleGrid) {
            for (int i = 0; i < width; i++) {
                if (row[i] == 1) {
                    dp[i] = 0;
                } else if (i > 0) {
                    dp[i] += dp[i - 1];
                }
            }
        }
        return dp[width - 1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)