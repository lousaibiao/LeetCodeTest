public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        String[] strs = new String[]{"flower", "fl", "flight"};
        System.out.println(helloWorld.longestCommonPrefix(strs));
        strs=new String[]{"dog","racecar","car"};
        System.out.println(helloWorld.longestCommonPrefix(strs));

    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0)
            return "";
        String str = strs[0];
        int i = 0;
        boolean isBreak = false;
        for (; i < str.length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i || strs[j].charAt(i) != str.charAt(i)) {
                    isBreak = true;
                    break;
                }
            }
            if (isBreak) break;
        }
        return str.substring(0, i);
    }
}
