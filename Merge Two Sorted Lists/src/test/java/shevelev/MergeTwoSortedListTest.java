package shevelev;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;

class MergeTwoSortedListTest {
    private ListNode list1 = ListNode.generate(2, 5, 10, 12);
    private ListNode list2 = ListNode.generate(2, 5, 10, 12);
    private ListNode expectedList12 = ListNode.generate(2, 2, 5, 5, 10, 10, 12, 12);

    private ListNode list3 = ListNode.generate(2, 5, 8, 15, 112);
    private ListNode list4 = ListNode.generate(3, 4, 9, 15);
    private ListNode expectedList34 = ListNode.generate(2, 3, 4, 5, 8, 9, 15, 15, 112);

    private ListNode list5 = null;
    private ListNode list6 = ListNode.generate(3, 4, 9, 15);
    private ListNode expectedList6 = ListNode.generate(3, 4, 9, 15);

    @Test
    void testmergeTwoLists0() {
        ListNode mergeList = MergeTwoSortedList.mergeTwoLists(list1, list2);
        assertThat(mergeList.equals(expectedList12)).isTrue();
    }

    @Test
    void testmergeTwoLists1() {
        ListNode mergeList = MergeTwoSortedList.mergeTwoLists(list3, list4);
        assertThat(mergeList.equals(expectedList34)).isTrue();
    }

    @Test
    void testmergeTwoLists2() {
        ListNode mergeList = MergeTwoSortedList.mergeTwoLists(list5, list6);
        assertThat(mergeList.equals(expectedList6)).isTrue();
    }
}