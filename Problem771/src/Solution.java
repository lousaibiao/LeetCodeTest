class Solution {
    public int numJewelsInStones(String J, String S) {
        int sum = 0;
        if (!J.equals(null) && !S.equals(null) && !J.equals("") && !S.equals("")) {
            for (int i = 0; i < S.length(); i++) {
                if (J.indexOf(S.charAt(i)) != -1) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String J = "aA", S = "aAAbbbb";
        System.out.println(solution.numJewelsInStones(J, S));
        J = "z";
        S = "ZZ";
        System.out.println(solution.numJewelsInStones(J, S));

    }
}