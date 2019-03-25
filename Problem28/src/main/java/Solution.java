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
}
