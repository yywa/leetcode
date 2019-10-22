package leetcode1047;

import java.util.HashSet;

/**
 * @author yyw
 * @date 2019/10/21
 */
public class SolutionOne {
    private static String removeDuplicates(String S) {
        HashSet<String> duplicates = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char i = 'a'; i <= 'z'; ++i) {
            sb.setLength(0);
            sb.append(i);
            sb.append(i);
            duplicates.add(sb.toString());
        }

        int prevLength = -1;
        while (prevLength != S.length()) {
            prevLength = S.length();
            for (String d : duplicates) {
                S = S.replace(d, "");
            }
        }

        return S;
    }

    public static void main(String[] args) {
        String s = "aa";
        System.out.println(removeDuplicates(s));
    }
}
