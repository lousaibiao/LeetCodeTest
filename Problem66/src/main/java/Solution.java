class Solution {
    public int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        boolean carry = digits[index] + 1 >= 10;
        digits[index] = digits[index] % 10;
        index--;
        while (carry && index >= 0) {
            digits[index] = digits[index] + 1;
            carry = digits[index] >= 10;
            if (carry) {
                digits[index] = digits[index] % 10;
                index--;
            }
        }
        if (carry && index == -1) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                newDigits[i + 1] = digits[i];
            }
            return newDigits;

        }
        return digits;
    }


}