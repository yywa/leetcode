package leetcode922;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author yyw
 * @date 2019/11/29
 **/
public class SolutionOne {

    private static int[] sortArrayByParityII(int[] A) {
        Stack<Integer> stackA = new Stack<>();
        Stack<Integer> stackB = new Stack<>();
        for (int x : A) {
            if (x % 2 == 0) {
                stackA.push(x);
            } else {
                stackB.push(x);
            }
        }
        int num = 0;
        while (!stackA.empty()) {
            A[num] = stackA.pop();
            num++;
            A[num] = stackB.pop();
            num++;
        }
        return A;
    }

    public static void main(String[] args) {
        int[] test = {4, 2, 5, 7};
        System.out.println(Arrays.toString(sortArrayByParityII(test)));
    }
}
