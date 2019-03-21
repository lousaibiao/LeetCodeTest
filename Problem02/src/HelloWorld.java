public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world");

        //542+665=1207
        ListNode node1 = new ListNode(5);
//        ListNode node2 = new ListNode(4);
//        ListNode node5 = new ListNode(5);
//        node1.next = node2;
//        node2.next =node5;
        ListNode node3 = new ListNode(9);
//        ListNode node4 = new ListNode(6);
//        ListNode node6 = new ListNode(6);
//        node3.next = node4;
//        node4.next = node6;
        ListNode sumNode = new HelloWorld().addTwoNumbers(node1, node3);
        new HelloWorld().showListNode(sumNode);
    }

    /*
    Input: (2 -> 4) + (5->5)
    Output: 7 -> 9
    Explanation: 42 + 55 = 97.
     */

    /**
     * @param l1 1
     * @param l2 2
     * @return node
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cur1 = l1, cur2 = l2;
        ListNode firstSumNode =new ListNode(0);
        ListNode curSumNode = firstSumNode;
        while (cur1 != null && cur2 != null) {
            int sumVal = cur1.val + cur2.val;
            curSumNode.val = sumVal % 10;
            if (sumVal >= 10) {
                if (cur1.next != null)
                    cur1.next.val += sumVal / 10;
                else if (cur2.next != null)
                    cur2.next.val += sumVal / 10;
                else cur1.next = new ListNode(sumVal / 10);
            }

            if (cur1.next!=null && cur2.next!=null){
                curSumNode.next = new ListNode(0);
                curSumNode = curSumNode.next;
            }
            cur1= cur1.next;
            cur2=cur2.next;

        }

        if (cur1 != null) {
            curSumNode = cur1;
        } else if (cur2 != null) {
            curSumNode = cur2;
        }
        return firstSumNode;
    }

    public void showListNode(ListNode node) {
        while (node.next != null) {
            System.out.print(node.val + "-->");
            node = node.next;
        }
        System.out.println(node.val);
    }

//    public ListNode addTwoNumber(ListNode n1,ListNode n2){
//        return new ListNode(n1.val+n2.val);
//    }

}

