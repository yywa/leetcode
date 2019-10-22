package leetcode824;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yyw
 * @date 2019/10/22
 */
public class SolutionOne {
    private static String toGoatLatin(String S) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        StringBuilder sb = new StringBuilder();
        String[] s = S.split(" ");
        for (int i = 0; i < s.length; i++) {
            StringBuilder sb1 = new StringBuilder();
            if (!set.contains(s[i].toLowerCase().charAt(0))) {
                sb1.append(s[i].substring(1)).append(s[i].charAt(0)).append("ma");
            } else {
                sb1.append(s[i]).append("ma");
            }
            int temp = i;
            while (temp >= 0) {
                sb1.append("a");
                temp--;
            }
            sb1.append(" ");
            sb.append(sb1);
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(toGoatLatin("E speak Goat Latin"));
    }
}
