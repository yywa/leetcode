package leetcode739;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author yyw
 * @date 2019/10/12
 */
public class SolutionOne {
    private static int[] dailyTemperatures(int[] T) {
        int length = T.length;
        int[] result = new int[length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < length; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
            } else {
                while (T[i] > T[stack.lastElement()]) {
                    result[stack.lastElement()] = i - stack.lastElement();
                    stack.pop();
                    if (stack.isEmpty()) {
                        break;
                    }
                }
                stack.push(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] t = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(dailyTemperatures(t)));
    }
}
