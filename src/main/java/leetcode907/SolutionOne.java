package leetcode907;

import java.util.Stack;

/**
 * @author yyw
 * @date 2019/12/4
 **/
public class SolutionOne {
    // FIXME: 2019/12/5  不太理解。望二刷时多多注意！
    private static int sumSubarrayMins(int[] A) {
        int MOD = 1_000_000_007;
        int N = A.length;
        Stack<Integer> stack = new Stack<>();
        int[] prev = new int[N];
        for (int i = 0; i < N; ++i) {
            while (!stack.isEmpty() && A[i] <= A[stack.peek()]) {
                stack.pop();
            }
            prev[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        stack = new Stack<>();
        int[] next = new int[N];
        for (int k = N - 1; k >= 0; --k) {
            while (!stack.isEmpty() && A[k] < A[stack.peek()]) {
                stack.pop();
            }
            next[k] = stack.isEmpty() ? N : stack.peek();
            stack.push(k);
        }
        long ans = 0;
        for (int i = 0; i < N; ++i) {
            ans += (i - prev[i]) * (next[i] - i) % MOD * A[i] % MOD;
            ans %= MOD;
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        int[] result = {3, 1, 2, 4};
        //3  1 2  4   31  12  24  312  124   3124
        System.out.println(sumSubarrayMins(result));
    }
}
