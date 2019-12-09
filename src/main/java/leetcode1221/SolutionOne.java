package leetcode1221;

/**
 * @author yyw
 * @date 2019/12/9
 */
public class SolutionOne {
    private static int balancedStringSplit(String s) {
        int temp = 0;
        int result = 0;
        for (Character c : s.toCharArray()) {
            if (c.equals('L')) {
                temp++;
            } else {
                temp--;
            }
            if (temp == 0) {
                result++;
            }
        }
        return temp == 0 ? result : 0;
    }

    public static void main(String[] args) {
        String s = "LLLLRRR";
        System.out.println(balancedStringSplit(s));
    }
}
