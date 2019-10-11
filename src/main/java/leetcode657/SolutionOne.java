package leetcode657;


/**
 * @author yyw
 * @date 2019/10/11
 */
public class SolutionOne {
    private static boolean judgeCircle(String moves) {
        int lResult = 0;
        int uResult = 0;
        char[] chars = moves.toCharArray();
        for (char c : chars) {
            if (c == 'L') {
                lResult++;
            } else if (c == 'R') {
                lResult--;
            } else if (c == 'U') {
                uResult++;
            } else {
                uResult--;
            }

        }
        return lResult == 0 && uResult == 0;
    }

    public static void main(String[] args) {
        System.out.println(judgeCircle("LLLRRRRUUD"));
    }
}
