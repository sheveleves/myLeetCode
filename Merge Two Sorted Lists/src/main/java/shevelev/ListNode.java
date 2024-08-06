package shevelev;

import java.util.Objects;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }

    public static ListNode generate(int... array) {
        ListNode headListNode = new ListNode();
        ListNode nextListNode = headListNode;
        for (int i = 0; i < array.length; i++) {
            nextListNode.val = array[i];
            if (i != array.length - 1) {
                nextListNode.next = new ListNode();
                nextListNode = nextListNode.next;
            }
        }
        return headListNode;
    }
}
