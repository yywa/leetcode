package leetcode15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yyw
 * @date 2020/6/12
 * @description 三数之和。  三指针法。
 */
public class SolutionOne {
    public static List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int first = 0; first < length; first++) {
            //判断重复。
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            int third = length - 1;
            int target = -nums[first];
            for (int second = first + 1; second < length; ++second) {
                // 需要和上一次枚举的数不相同
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }
                // 需要保证 b 的指针在 c 的指针的左侧
                while (second < third && nums[second] + nums[third] > target) {
                    --third;
                }
                // 如果指针重合，随着 b 后续的增加
                // 就不会有满足 a+b+c=0 并且 b<c 的 c 了，可以退出循环
                if (second == third) {
                    break;
                }
                if (nums[second] + nums[third] == target) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    ans.add(list);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}
