import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void deleteDuplicates12() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        node1.next = node2;
        node2.next = node3;
        ListNode nodeRst = solution.deleteDuplicates(node1);
        Utilties.showListNode(nodeRst);

        ListNode nodeExcept1 = new ListNode(1);
        ListNode nodeExcept2 = new ListNode(2);
        nodeExcept1.next = nodeExcept2;
        Assertions.assertEquals(true, Utilties.listNodeEquals(node1, nodeExcept1));
    }

    @Test
    void deleteDuplicates123() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode nodeRst = solution.deleteDuplicates(node1);
        Utilties.showListNode(nodeRst);

        ListNode nodeExcept1 = new ListNode(1);
        ListNode nodeExcept2 = new ListNode(2);
        ListNode nodeExcept3 = new ListNode(3);
        nodeExcept1.next = nodeExcept2;
        nodeExcept2.next = nodeExcept3;
        Assertions.assertEquals(true, Utilties.listNodeEquals(node1, nodeExcept1));
    }
}
