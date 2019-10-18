package leetcode485;

/**
 * @author yyw
 * @date 2019/10/18
 */
public class SolutionOne {


    private static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int temp = 0;
        for (int a : nums) {
            if (a == 1) {
                temp++;
            } else {
                max = Math.max(max, temp);
                temp = 0;
            }
        }
        return Math.max(max, temp);
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(a));
    }
}
