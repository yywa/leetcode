package leetcode345;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author yyw
 * @date 2019/8/12
 **/
public class SolutionOne {

    private static String reverseVowels(String s) {
        HashSet<Character> set = new HashSet<>(Arrays.asList('a', 'o', 'e', 'i', 'u', 'A', 'O', 'E', 'I', 'U'));
        int i = 0, j = s.length() - 1;
        char[] result = new char[s.length()];
        while (i <= j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (!set.contains(ci)) {
                result[i++] = ci;
            } else if (!set.contains(cj)) {
                result[j--] = cj;
            } else {
                result[i++] = cj;
                result[j--] = ci;
            }
        }
        return new String(result);
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }

}
