package shevelev;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static shevelev.FindModeInBinarySearchTree.findMode;

class FindModeInBinarySearchTreeTest {
    private TreeNode root = generate();
    int[] arr = {8};
    private TreeNode generate() {
        TreeNode root = new TreeNode(20);
        TreeNode node1 = new TreeNode(10);
        TreeNode node2 = new TreeNode(25);
        root.left = node1;
        root.right = node2;

        TreeNode node3 = new TreeNode(8);
        TreeNode node4 = new TreeNode(9);
        node1.left = node3;
        node1.right = node4;

        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(8);
        node3.left = node5;
        node3.right = node6;

        TreeNode node7 = new TreeNode(24);
        TreeNode node8 = new TreeNode(23);

        node2.left = node8;
        node2.right = node7;
        return root;
    }

    @Test
    void findModeInBinarySearchTreeTest1() {
        assertThat(findMode(root)).isEqualTo(arr);
    }
}
