import org.junit.Test;

class Solution {
    public static int lengthOfLastWord(String s) {
        if (s == null || s.equals("")) return 0;
        int length = 0;
        int index = s.length() - 1;
        while (index >= 0 && s.charAt(index) == ' ') {
            index--;
            continue;
        }

        for (int i = index; i >= 0; i--) {
            if (s.charAt(i) == ' ') break;
            else length++;
        }
        return length;
    }

    public static void main(String[] args) {
        String s = "aaa ";
        s.split(" ");

    }

}