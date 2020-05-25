package leetcode146;

import java.rmi.Remote;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yyw
 * @date 2020/5/25
 * @description 采用hashMap和自定义的双向链表来实现。
 */
public class LRUCacheTwo {

    /**
     * 定义内部的双向链表
     */
    class DLinkedNode {
        int key;
        int value;
        DLinkedNode prev;
        DLinkedNode next;

        public DLinkedNode() {

        }

        public DLinkedNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }


    private Map<Integer, DLinkedNode> cache = new HashMap<>(8);
    /**
     * 内部用来记录实际放入的数据大小。
     */
    private int size;
    private int capacity;
    private DLinkedNode head, tail;

    public LRUCacheTwo(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        DLinkedNode node = cache.get(key);
        if (null == node) {
            return -1;
        }
        //当key存在时，将key移到头部。
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        DLinkedNode node = cache.get(key);
        if (null == node) {
            DLinkedNode newNode = new DLinkedNode(key, value);
            cache.put(key, newNode);
            //将新节点移到头部。
            addToHead(newNode);
            ++size;
            //如果size大于容量，就要删除末尾的节点
            if (size > capacity) {
                DLinkedNode tail = removeTail();
                cache.remove(tail.key);
                --size;
            }
        } else {
            //如果存在，则更新值，并移到头部。
            node.value = value;
            moveToHead(node);
        }
    }

    private DLinkedNode removeTail() {
        DLinkedNode res = tail.prev;
        removeNode(res);
        return res;
    }

    private void addToHead(DLinkedNode node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private void moveToHead(DLinkedNode node) {
        removeNode(node);
        addToHead(node);
    }

    private void removeNode(DLinkedNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public static void main(String[] args) {
        LRUCacheTwo cache = new LRUCacheTwo(2);

        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));       // 返回  1
        cache.put(3, 3);    // 该操作会使得密钥 2 作废
        cache.get(2);       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得密钥 1 作废
        cache.get(1);       // 返回 -1 (未找到)
        cache.get(3);       // 返回  3
        cache.get(4);       // 返回  4
    }
}
