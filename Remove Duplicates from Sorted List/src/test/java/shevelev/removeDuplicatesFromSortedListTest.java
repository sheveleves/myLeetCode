package shevelev;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;

class removeDuplicatesFromSortedListTest {
    ListNode listNode;
    ListNode expectedListNode;
    ListNode processedList;

    @Test
    void listTest1() {
        listNode = Solution.getListNodeFromFile("src/test/list0.txt");
        System.out.println(Solution.printListNode(listNode));
        processedList = Solution.deleteDuplicates(listNode);
        System.out.println(Solution.printListNode(processedList));
        expectedListNode = Solution.getListNodeFromFile("src/test/list00.txt");
        System.out.println(Solution.printListNode(expectedListNode));
        assertThat(processedList.equals(expectedListNode)).isTrue();
    }
    @Test
    void listTest2() {
        listNode = Solution.getListNodeFromFile("src/test/list1.txt");
        System.out.println(Solution.printListNode(listNode));
        processedList = Solution.deleteDuplicates(listNode);
        System.out.println(Solution.printListNode(processedList));
        expectedListNode = Solution.getListNodeFromFile("src/test/list11.txt");
        System.out.println(Solution.printListNode(expectedListNode));
        assertThat(processedList.equals(expectedListNode)).isTrue();
    }

    @Test
    void listTest3() {
        listNode = Solution.getListNodeFromFile("src/test/list2.txt");
        assertThat(processedList == null).isTrue();
    }

    @Test
    void listTest4() {
        listNode = Solution.getListNodeFromFile("src/test/list3.txt");
        processedList = Solution.deleteDuplicates(listNode);
        System.out.println(Solution.printListNode(processedList));
        expectedListNode = new ListNode(50);
        System.out.println(Solution.printListNode(expectedListNode));
        assertThat(processedList.equals(expectedListNode)).isTrue();
    }
}
