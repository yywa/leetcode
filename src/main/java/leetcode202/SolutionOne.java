package leetcode202;


/**
 * @author yyw
 * @date 2020/4/30
 * @description 快慢指针破循环
 */
public class SolutionOne {
    private static int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }

    public static boolean isHappy(int n) {
        int fast = getNext(n);
        int slow = n;
        do {
            fast = getNext(fast);
            fast = getNext(fast);
            slow = getNext(slow);
        } while (fast != slow);
        return fast == 1;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(10));
    }
}
