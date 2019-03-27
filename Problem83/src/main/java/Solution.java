
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null) return head;
        ListNode pre = head, first = head;
        while (head.next != null) {
            if (pre.val != head.next.val) {
                pre.next = head.next;
                pre = pre.next;
            }
            head = head.next;
        }
        if (pre.val != head.val) {
            pre.next = head;
        } else {
            pre.next = null;//默认pre是带next的。
        }
        return first;
    }
}