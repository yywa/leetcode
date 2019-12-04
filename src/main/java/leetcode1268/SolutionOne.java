package leetcode1268;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yyw
 * @date 2019/12/4
 **/
public class SolutionOne {
    private static List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (Character c : searchWord.toCharArray()) {
            sb.append(c);
            List<String> list = new ArrayList<>();
            for (String s : products) {
                if (list.size() < 3 && s.startsWith(sb.toString())) {
                    list.add(s);
                }
            }
            result.add(list);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] products = {"mobile", "mouse", "moneypot", "monitor", "mousepad"};
        String searchWord = "mouse";
        System.out.println(suggestedProducts(products, searchWord));
    }
}
