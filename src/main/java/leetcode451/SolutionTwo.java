package leetcode451;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yyw
 * @version 1.0
 * @date 2019/8/19 21:58
 **/
public class SolutionTwo {
    private static String frequencySort(String s) {
        int[] hash = new int[256];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }
        int[] hash1 = hash.clone();
        Arrays.sort(hash);
        for (int i = 255; i >= 202 && hash[i] > 0; i--) {
            for (int j = 0; j < 256; j++) {
                if(hash[i] == hash1[j]){
                    while(hash1[j]-- >0){
                        sb.append((char)j);
                    }
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
}
