public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.equals("")) return 0;
        if (needle.length() > haystack.length()) return -1;
        int k = 0;
//        boolean matchAll = false;
        for (int i = 0; i < haystack.length(); i++) {
            for (int j = 0; j < needle.length() && i + k < haystack.length(); j++) {
                if (haystack.charAt(i + k) == needle.charAt(j)) {
                    k++;
                } else {
                    k = 0;
                    break;
                }
            }
            if (k == needle.length()) return i;
        }
        return -1;
    }

    public int strStrSubString(String haystack, String needle) {
        if (needle == null || needle.equals("")) return 0;
        if (needle.length() > haystack.length()) return -1;

        for (int i = 0; i < haystack.length() && i + needle.length() <= haystack.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "aa";
        s.substring(0, 1);
    }
}
