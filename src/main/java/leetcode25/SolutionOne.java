package leetcode25;

/**
 * @author yyw
 * @date 2019/10/11
 */

public class SolutionOne {
    private static ListNode reverseKGroup(ListNode head, int k) {
        if (k == 0) {
            return head;
        }
        int temp = k;
        ListNode p = head;
        while (temp > 1) {
            if (p == null) {
                break;
            }
            p = p.next;
            temp--;
        }
        if (p == null) {
            return head;
        }
        ListNode head_pre = head, pNext_pre = p.next;
        head = reverseList(head, p);
        p = head_pre;
        p.next = reverseKGroup(pNext_pre, k);
        return head;
    }

    private static ListNode reverseList(ListNode head, ListNode endNode) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode end = endNode.next;
        while (cur != end) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}