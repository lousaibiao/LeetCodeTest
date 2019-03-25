class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode[] nodes = new ListNode[100];
        int index = 0;
        while (head != null) {
            nodes[index++] = head;
            head = head.next;
        }
        return nodes[index / 2];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        showNodes(solution.middleNode(node1));
    }

    private static void showNodes(ListNode node) {
        System.out.print("[");
        ListNode cur = node;
        while (cur != null) {
            System.out.print(cur.val + ",");
            cur = cur.next;
        }
        System.out.print("]");
    }
}