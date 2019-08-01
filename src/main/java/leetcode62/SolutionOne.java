package leetcode62;

/**
 * @author yyw
 * @date 2019/8/1
 * <p>
 * 执行用时 :1 ms, 在所有 Java 提交中击败了96.56%的用户
 * 内存消耗 :33.3 MB, 在所有 Java 提交中击败了13.85%的用户
 *
 * 解题思路，转化成二维数组，也就是从(0,0)到(m,n)的路径数目，动态规划
 **/
public class SolutionOne {

    private static int uniquePaths(int m, int n) {
        int[][] temp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    temp[i][j] = 1;
                    continue;
                }
                temp[i][j] = temp[i - 1][j] + temp[i][j - 1];
            }
        }
        return temp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 2));
    }
}
