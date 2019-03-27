public class Utilties {
    public static void printDigits(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + ",");
        }
        System.out.println();
    }

    public static boolean arrayEquals(int[] arr1, int[] arr2) {
        if (arr1 == null && arr2 == null) return true;
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) return false;
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void showListNode(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " --> ");
            node = node.next;
        }
    }

    public static boolean listNodeEquals(ListNode node1, ListNode node2) {
        while (node1 != null && node2 != null) {
            if (node1.val != node2.val) {
                return false;
            }
            node1 = node1.next;
            node2 = node2.next;
        }
        if (node1 != null || node2 != null) return false;
        return true;
    }

}
