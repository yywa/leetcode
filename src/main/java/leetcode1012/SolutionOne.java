package leetcode1012;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yyw
 * @date 2019/8/1
 *
 * 双重for循环遍历，最后输出，超时限制了。
 **/
public class SolutionOne {

    private static int numDupDigitsAtMostN(int N) {
        int result = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 1; i <= N; i++) {
            set.clear();
            char[] chars = Integer.toString(i).toCharArray();
            for (char c : chars) {
                if (set.contains(c)) {
                    result++;
                    break;
                } else {
                    set.add(c);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5987490;
        System.out.println(numDupDigitsAtMostN(n));
    }
}
