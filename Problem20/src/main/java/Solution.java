public class Solution {
    public boolean isValid(String s) {
        if (s.equals(null) || s.equals("")) return true;
        int length = s.length();
        short[] values = new short[length];
        int j = 0;
        //()[]{}
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                values[j++] = '(';
            } else if (s.charAt(i) == '[') {
                values[j++] = '[';
            } else if (s.charAt(i) == '{') {
                values[j++] = '{';
            } else if (s.charAt(i) == ')') {
                if (j == 0 || values[j - 1] != '(') return false;
                else {
                    j--;
                }
            } else if (s.charAt(i) == ']') {
                if (j == 0 || values[j - 1] != '[') return false;
                else j--;
            } else if (s.charAt(i) == '}') {
                if (j == 0 || values[j - 1] != '{') return false;
                else j--;
            }
        }
        if(j!=0) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Short.MAX_VALUE);
    }
}
