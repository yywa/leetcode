package leetcode412;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yyw
 * @date 2019/9/29
 */
public class SolutionOne {
    private static List<String> fizzBuzz(int n) {
        ArrayList<String> result = new ArrayList<>();
        int length = n + 1;
        for (int i = 1; i < length; i++) {
            boolean flag1 = i % 3 == 0;
            boolean flag2 = i % 5 == 0;
            if (flag1 && flag2) {
                result.add("FizzBuzz");
            } else if (flag1 && !flag2) {
                result.add("Fizz");
            } else if (!flag1 && flag2) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        fizzBuzz(15);
    }
}
