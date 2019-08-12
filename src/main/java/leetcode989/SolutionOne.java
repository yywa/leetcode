package leetcode989;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yyw
 * @date 2019/8/12
 **/
public class SolutionOne {

    private static List<Integer> addToArrayForm(int[] A, int K) {
        // 进位
        int carry = 0;
        // 加到A数组
        for (int i = A.length - 1; i >= 0; i--, K /= 10) {
            int temp = A[i] + K % 10 + carry;
            A[i] = temp % 10;
            carry = temp / 10;
            if (K == 0 && carry == 0) {
                break;
            }
        }
        List<Integer> list = new ArrayList<>();
        // 若K为0，说明A数组的数长度更长
        if (K == 0) {
            if (carry != 0) {
                list.add(carry);
            }
            for (int num : A) {
                list.add(num);
            }
            // 否则，K更长
        } else {
            K += carry;
            // 求得K的位数
            int bit = (int) Math.log10(K) + 1;
            int[] head = new int[bit];
            for (int i = head.length - 1; i >= 0; i--, K /= 10) {
                head[i] = K % 10;
            }
            for (int num : head) {
                list.add(num);
            }
            for (int num : A) {
                list.add(num);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3};
        int b = 456;
        System.out.println(addToArrayForm(a, b));
    }
}
