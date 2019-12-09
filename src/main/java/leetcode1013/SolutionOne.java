package leetcode1013;


/**
 * @author yyw
 * @date 2019/12/9
 */
public class SolutionOne {


    private static boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int i : A) {
            sum += i;
        }
        if (sum % 3 != 0) {
            return false;
        }
        int temp = sum / 3;
        sum = 0;
        for (int i : A) {
            sum += i;
            if (sum == temp) {
                sum = 0;
            }
        }
        return sum == 0;
    }

    public static void main(String[] args) {
        int[] temp = {3, 3, 6, 5, -2, 2, 5, 1, -9, 4};
        System.out.println(canThreePartsEqualSum(temp));
    }
}
