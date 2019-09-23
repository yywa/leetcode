package leetcode498;

/**
 * @author yyw
 * @date 2019/9/23
 **/
public class SolutionOne {
    private static int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }

        int m = matrix.length - 1;
        int n = matrix[0].length - 1;

        int[] newArray = new int[(m + 1) * (n + 1)];
        int row = 0, col = 0;

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = matrix[row][col];//初始化
            if ((row + col) % 2 == 0) {//右上方向，为偶数时向右上方向，
                if (col == n) {//边界就是当列到最右边时，即行向下
                    row++;
                } else if (row == 0) {
                    col++;
                } else {
                    row--;
                    col++;
                }
            } else {//奇数时，向左下方向
                if (row == m) {
                    col++;
                } else if (col == 0) {
                    row++;
                } else {
                    row++;
                    col--;
                }
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        findDiagonalOrder(matrix);
    }
}
