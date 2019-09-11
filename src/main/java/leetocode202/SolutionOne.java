package leetocode202;

/**
 * @author yyw
 * @date 2019/9/11
 * <p>
 * 快慢指针！
 **/
public class SolutionOne {
    private static int bitSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int bit = n % 10;
            sum += bit * bit;
            n = n / 10;
        }
        return sum;
    }

    private static boolean isHappy(int n) {
        int slow = n, fast = bitSquareSum(n);
        while (slow != fast) {
            slow = bitSquareSum(slow);
            fast = bitSquareSum(fast);
            fast = bitSquareSum(fast);
        }
        return slow == 1;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(121));
    }
}
