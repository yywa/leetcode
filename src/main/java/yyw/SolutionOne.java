package yyw;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yyw
 * @date 2019/9/23
 **/
public class SolutionOne {
    private static List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }

        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        int length = matrix.length * matrix[0].length;
        List<Integer> list = new ArrayList<>((length));
        int row = 0, col = 0;
        //flag false 表示行 true 表示列
        boolean flag = false;
        //用来统计循环了几次。
        int sum = 0;
        for (int i = 0; i < length; i++) {
            int matrix1 = matrix[row][col];
            list.add(i, matrix[row][col]);
            if (sum == m) {
                col = flag ? 0 : m;
                row++;
                flag = !flag;
                sum = 0;
            } else {
                col = flag ? col - 1 : col + 1;
                sum++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        spiralOrder(matrix);
    }
}
