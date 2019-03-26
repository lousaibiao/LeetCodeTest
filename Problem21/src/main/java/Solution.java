class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 != null) return l2;
        if (l1 != null && l2 == null) return l1;
        if (l1 == null && l2 == null) return null;
        ListNode firstParent = null, curParent = null;
        if (l1.val <= l2.val) {
            firstParent = l1;
            l1 = l1.next;
        } else {
            firstParent = l2;
            l2 = l2.next;
        }
        curParent = firstParent;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curParent.next = l1;
                curParent = curParent.next;
                l1 = l1.next;
            } else {
                curParent.next = l2;
                curParent = curParent.next;
                l2 = l2.next;
            }
        }
        if (l1 != null) curParent.next = l1;
        if (l2 != null) curParent.next = l2;

        return firstParent;
    }

    public void showNodes(ListNode node) {
        while (node != null) {
            System.out.print(node.val + ",");
            node = node.next;
        }
        System.out.println();
    }
}
