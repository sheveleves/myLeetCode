package shevelev;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindModeInBinarySearchTree {
    public static int[] findMode(TreeNode root) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map = traversTree(root, map);
        if (map.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            return countAll(root, list).stream().mapToInt(value -> value).toArray();
        }

        int maxValue = 0;
        int lengthArray = 0;

        for (Map.Entry<Integer, Integer> key : map.entrySet()) {
            if (maxValue < key.getValue()) {
                maxValue = key.getValue();
                lengthArray = 1;
            } else if (maxValue == key.getValue()) lengthArray++;
        }

        int[] result = new int[lengthArray];
        lengthArray = 0;
        for (Map.Entry<Integer, Integer> key : map.entrySet()) {
            if (maxValue == key.getValue()) {
                result[lengthArray++] = key.getKey();
            }
            if (lengthArray == result.length) {
                break;
            }

        }
        return result;
    }

    public static HashMap<Integer, Integer> traversTree(TreeNode node, HashMap<Integer, Integer> map) {
        if (!map.containsKey(node.val)) {
            map.put(node.val, 1);
        } else {
            Integer value = map.get(node.val);
            value++;
            map.put(node.val, value);
        }

        if (node.left != null) {
            traversTree(node.left, map);
        }
        if (node.right != null) {
            traversTree(node.right, map);
        }
        return map;
    }


    public static List<Integer> countAll(TreeNode root, List<Integer> list) {
        list.add(root.val);
        if (root.right != null) {
            countAll(root.right, list);
        }
        if (root.left != null) {
            countAll(root.left, list);
        }
        return list;
    }
}
