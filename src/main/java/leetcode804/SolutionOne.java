package leetcode804;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yyw
 * @date 2019/10/11
 */
public class SolutionOne {
    private final String[] MORSE = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>(words.length / 2);
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                sb.append(MORSE[(int) c - 97]);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
