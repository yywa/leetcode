package leetcode771;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yyw
 * @date 2019/10/11
 */
public class SolutionOne {
    private static int numJewelsInStones(String J, String S) {
        int result = 0;
        Set<Character> set = new HashSet<>();
        char[] chars = J.toCharArray();
        for (char c : chars) {
            set.add(c);
        }
        for (char c : S.toCharArray()) {
            if (set.contains(c)) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        System.out.println(numJewelsInStones(J, S));
    }
}
