package top.xiaotian.dataStructures.linkedlist.practice;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/12/5
 */
public class Node {
    public Object value;

    public Node next;

    public Node() {

    }

    public Node(Object value, Node next) {
        this.value = value;
        this.next = next;
    }
}