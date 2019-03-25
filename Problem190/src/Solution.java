public class Solution {
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        int factor = n % 2;

        int min = -(int) Math.pow(2, 31);
        int halfMax = (int) Math.pow(2, 30);
        int value = factor * min;
        n = n / 2;
        while (n != 0) {
            factor = n % 2;
            if (factor < 0) factor = -factor;
            if (factor != 0)
                value += (halfMax * factor);
            n = n / 2;
            halfMax /= 2;
        }
        return value;
    }

    public static void main(String[] args) {
        //2147483647
//        System.out.println((long) Math.pow(2, 31));
//
//        System.out.println("-2^31=" + (int) -Math.pow(2, 31));
//        System.out.println("2^30=" + (int) Math.pow(2, 30));
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(-3 % 2);

        int n = 43261596;
        int sum = 0;
        int[] pows = new int[]{2, 3, 4, 7, 9, 10, 11, 12, 18, 20, 23, 25};
//        pows = new int[]{0, 2, 4, 5, 6, 7, 8, 9, 12, 14, 15, 18, 21, 22, 23, 25, 26, 28};
//        pows= new int[]{0,3,5,6,8,9,13,16,17,19,22,23,24,25,26,27,29};
//        for (int i = 0; i < pows.length; i++) {
//            sum += (int) Math.pow(2, pows[i]);
//        }
//        System.out.println(sum + (int) -Math.pow(2, 31));

//        n = 1;
//        n = -1763388427;
//        System.out.println(reverseBits(n));
        n = -3;
        System.out.println(reverseBits(n));
        //1073741825
        //1073741823
    }
}