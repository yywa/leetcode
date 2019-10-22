package leetcode434;

/**
 * @author yyw
 * @date 2019/10/22
 */
public class SolutionOne {
    private static int countSegments(String s) {
        String[] s1 = s.trim().split(" ");
        int result = s1.length;
        for (String str : s1) {
            if (("").equals(str)) {
                result--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = " ";
        System.out.println(countSegments(s));
    }
}
