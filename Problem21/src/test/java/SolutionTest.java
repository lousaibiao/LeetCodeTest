import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class SolutionTest {
    private final Solution solution = new Solution();
    @Test
    void mergeTwoListsEqual(){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(2);
        ListNode node6 = new ListNode(4);
        node4.next = node5;
        node5.next = node6;

        ListNode mergedNode = solution.mergeTwoLists(node1,node4);
        solution.showNodes(mergedNode);
    }

    @Test
    void mergeTwoListsFirstLong(){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        ListNode node4 = new ListNode(9);
//        ListNode node5 = new ListNode(2);
//        ListNode node6 = new ListNode(4);
//        node4.next = node5;
//        node5.next = node6;

        ListNode mergedNode = solution.mergeTwoLists(node1,node4);
        solution.showNodes(mergedNode);
    }
    @Test
    void mergeTwoListsSecondLong(){
        ListNode node1 = new ListNode(1);
//        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(4);
//        node1.next = node2;
//        node2.next = node3;
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(2);
        ListNode node6 = new ListNode(4);
        node4.next = node5;
        node5.next = node6;

        ListNode mergedNode = solution.mergeTwoLists(node1,node4);
        solution.showNodes(mergedNode);
    }



}
