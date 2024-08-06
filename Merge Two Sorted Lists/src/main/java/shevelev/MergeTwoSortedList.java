package shevelev;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class MergeTwoSortedList {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode headListNode = new ListNode();
        ListNode nextListNode = headListNode;
        ListNode previousListNode = headListNode;
        while (list1 != null & list2 != null) {
            if (list1.val > list2.val) {
                nextListNode.val = list2.val;
                list2 = list2.next;
            } else {
                nextListNode.val = list1.val;
                list1 = list1.next;
            }
            nextListNode.next = new ListNode();
            previousListNode = nextListNode;
            nextListNode = nextListNode.next;
        }

        previousListNode.next = list1 == null ? list2 : list1;
        return headListNode;
    }
}