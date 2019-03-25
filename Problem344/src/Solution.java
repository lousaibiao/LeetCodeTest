class Solution {
    public static void reverseString(char[] s) {
        int end = s.length - 1, start = 0;
        char val = 0;
        while (end > start) {
            val = s[end];
            s[end] = s[start];
            s[start] = val;
            end--;
            start++;
        }
    }

    public static void main(String[] args) {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        showArray(s);
        reverseString(s);
        showArray(s);
    }

    private static void showArray(char[] s) {
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
        System.out.println();
    }
}