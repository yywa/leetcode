package leetcode1252;

/**
 * @author yyw
 * @date 2020/4/30
 * @description
 */
public class SolutionOne {
    public int oddCells(int n, int m, int[][] indices) {
        boolean[] r = new boolean[n];
        boolean[] c = new boolean[m];
        int i;
        for (i = 0; i < indices.length; i++) {
            r[indices[i][0]] = !r[indices[i][0]];
            c[indices[i][1]] = !c[indices[i][1]];
        }
        int rr = 0, cc = 0;
        for (i = 0; i < r.length; i++) {
            if (r[i]) {
                rr++;
            }
        }
        for (i = 0; i < c.length; i++) {
            if (c[i]) {
                cc++;
            }
        }
        return rr * m + cc * n - rr * cc * 2;
    }

    public static void main(String[] args) {
        int n = 2;
        int m = 2;
        int[][] indices = {{1, 1}, {0, 0}};
        System.out.println(new SolutionOne().oddCells(n, m, indices));
    }
}
