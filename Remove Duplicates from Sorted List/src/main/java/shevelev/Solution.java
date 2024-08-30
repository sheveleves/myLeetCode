package shevelev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static String printListNode(ListNode listNode) {
        if (listNode == null) {
            return "empty";
        }
        String result = String.valueOf(listNode.val);
        while (listNode.next != null) {
            listNode = listNode.next;
            result = "%s -> %d".formatted(result, listNode.val);
        }
        return result;
    }

    public static ListNode getListNodeFromFile(String path) {
        ListNode listNode = new ListNode();
        ListNode nextNode = listNode;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();
            if (line == null) {
                return null;
            }
            while (line != null) {
                nextNode.val = Integer.parseInt(line);
                line = reader.readLine();
                if (line != null) {
                    nextNode.next = new ListNode();
                    nextNode = nextNode.next;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listNode;
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode result = new ListNode();
        result.val = head.val;
        ListNode currentForResult = result;
        while (head.next != null) {
            if (head.next.val != currentForResult.val) {
                currentForResult.next = head.next;
                currentForResult = currentForResult.next;
            }
            head = head.next;
        }
        currentForResult.next = null;
        return result;
    }
}
