package leetcode35;

/**
 * @author yyw
 * @date 2019/9/9
 **/
public class SolutionOne {
    private static int searchInsert(int[] nums, int target) {
        int result = 0;
        if (nums.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    result = i;
                } else if (nums[i] < target) {
                    result++;
                } else if (nums[i] > target) {
                    break;
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 0;
        System.out.println(searchInsert(nums, target));
    }
}
