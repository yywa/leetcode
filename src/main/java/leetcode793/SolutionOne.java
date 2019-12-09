package leetcode793;

/**
 * @author yyw
 * @date 2019/12/9
 * <p>
 * 令 zeta(x) 为 x! 末尾零的个数。如果 x! 可以分解为素数的乘积，如 (2^a * 5^b * \cdots )(2
 * a
 * ∗5
 * b
 * ∗⋯) 的形式，那么 x! 末尾零的个数为 min(a, b) = b。
 */
public class SolutionOne {
    private static int preimageSizeFZF(int K) {
        long lo = K, hi = 10 * K + 1;
        while (lo < hi) {
            long mi = lo + (hi - lo) / 2;
            long zmi = zeta(mi);
            if (zmi == K) {
                return 5;
            } else if (zmi < K) {
                lo = mi + 1;
            } else {
                hi = mi;
            }
        }
        return 0;
    }

    private static long zeta(long x) {
        if (x == 0) {
            return 0;
        }
        return x / 5 + zeta(x / 5);
    }

    public static void main(String[] args) {
        System.out.println(preimageSizeFZF(11));
    }
}
