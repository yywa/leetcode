package leetcode551;

/**
 * @author yyw
 * @date 2019/11/29
 **/
public class SolutionOne {

    private static boolean checkRecord(String s) {
        if (s.contains("LLL")) {
            return false;
        }
        int count = 0;
        for (Character c : s.toCharArray()) {
            if (c.equals('A')) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "AA";
        System.out.println(checkRecord(s));
    }
}
