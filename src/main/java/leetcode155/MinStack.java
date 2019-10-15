package leetcode155;

import java.util.LinkedList;

/**
 * @author yyw
 * @date 2019/10/14
 */
public class MinStack {

    private LinkedList<Integer> linkedList;
    private int min = Integer.MAX_VALUE;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        linkedList = new LinkedList<>();
    }

    public void push(int x) {
        if (x < min) {
            min = x;
        }
        linkedList.add(x);
    }

    public void pop() {
        Integer last = linkedList.getLast();
        linkedList.removeLast();
        if (min == last) {
            min = Integer.MAX_VALUE;
            for (Integer integer : linkedList) {
                if (integer < min) {
                    min = integer;
                }
            }
        }
    }

    public int top() {
        return linkedList.getLast();
    }

    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println();
    }
}
