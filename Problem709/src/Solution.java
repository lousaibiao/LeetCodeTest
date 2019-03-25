public class Solution {
    public String toLowerCase(String str) {
        StringBuilder builder = new StringBuilder();
        if (str != null && !str.isEmpty()) {
            for (int i = 0; i < str.length(); i++) {
                if (65 <= (int) str.charAt(i) && (int) str.charAt(i) <= 90) {
                    builder.append((char) ((int) str.charAt(i) + 32));
                } else {
                    builder.append(str.charAt(i));
                }
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "Hello" ;
        System.out.println(solution.toLowerCase(str));
        str = "here";
        System.out.println(solution.toLowerCase(str));
        str="LOVELY";
        System.out.println(solution.toLowerCase(str));
//        char a = 'a', z = 'z', A = 'A', Z = 'Z';
//        System.out.println("a:" + (int) a);
//        System.out.println("z:" + (int) z);
//        System.out.println("A:" + (int) A);
//        System.out.println("Z:" + (int) Z);
    }
}
