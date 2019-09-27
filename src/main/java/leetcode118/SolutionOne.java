package leetcode118;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:yyw
 * @date:2019/9/27
 */
public class SolutionOne {
    private static List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        if (numRows == 0) {
            return list;
        }
        list.add(new ArrayList<>());
        list.get(0).add(1);
        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = list.get(rowNum-1);
            row.add(1);
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }
            row.add(1);
            list.add(row);
        }
        return list;
    }

    public static void main(String[] args) {
        generate(1);
    }
}
