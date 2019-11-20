package leetcode756;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yyw
 * @date 2019/11/20
 **/
public class SolutionOne {
    private static String allowedString = "ABCDEFG";

    private static boolean pyramidTransition(String bottom, List<String> allowed) {
        Map<String, Integer> allowedNums = convert(allowed);
        return dealNextFloor(allowedNums, "", bottom, 0);
    }


    private static boolean dealNextFloor(Map<String, Integer> allowedNums, String bottom, String origin, int k) {
        if (k == origin.length() - 1) {
            return origin.length() == 1 || dealNextFloor(allowedNums, "", bottom, 0);
        }
        String key = origin.substring(k, k + 2);
        if (!allowedNums.containsKey(key)) {
            return false;
        }
        int allowedNum = allowedNums.get(key);
        if (allowedNum > 0) {
            for (int j = 0; j < 7; j++) {
                if ((allowedNum >> j & 1) == 1) {
                    bottom += allowedString.charAt(j);
                    boolean flag = dealNextFloor(allowedNums, bottom, origin, k + 1);
                    if (flag) {
                        return true;
                    }
                    bottom = bottom.substring(0, bottom.length() - 1);
                }
            }
        }
        return false;
    }

    private static Map<String, Integer> convert(List<String> allowed) {
        int[] nums = {1, 2, 4, 8, 16, 32, 64};
        Map<String, Integer> map = new HashMap<>();
        for (String allow : allowed) {
            int c = nums[allow.charAt(2) - 'A'];
            String key = allow.substring(0, 2);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + c);
            } else {
                map.put(key, c);
            }
        }
        return map;
    }
}
