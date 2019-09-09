package leetcode451;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yyw
 * @version 1.0
 * @date 2019/8/19 21:49
 **/
public class SolutionOne {

    private static String frequencySort(String s) {
        char[] chs = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>(24);
        int maxTimes = -1;
        //统计每个字母的频次，并存入哈希表
        for (char c : chs) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
            maxTimes = map.get(c) > maxTimes ? map.get(c) : maxTimes;
        }
        //新建一个桶，将字母存入索引为它的频次的桶里
        ArrayList<Character>[] buckets = new ArrayList[maxTimes + 1];
        for (char c : map.keySet()) {
            int frequency = map.get(c);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(c);
        }
        //倒着遍历桶，将桶里的字母取出来，并按照它的频次插入字符数组中
        int p = 0;
        for (int i = maxTimes; i >= 0; i--) {
            if (buckets[i] != null) {
                for (char c : buckets[i]) {
                    //buckets[i]这个桶里的字母的频次为i，因此要插入i个到结果集中
                    for (int j = 0; j < i; j++) {
                        //复用chs作为结果集
                        chs[p++] = c;
                    }
                }
            }
        }
        return new String(chs);
    }

    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
}
