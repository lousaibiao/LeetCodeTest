public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sum = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        boolean carry = false;
        short digit = 0;
        while (i >= 0 && j >= 0) {
            if (carry) {
                if (a.charAt(i) == '1') {
                    if (b.charAt(j) == '0') {
                        sum.insert(0, '0');
                    } else {
                        sum.insert(0, '1');
                    }
                    carry = true;

                } else {
                    if (b.charAt(j) == '0') {
                        sum.insert(0, '1');
                        carry = false;
                    } else {
                        sum.insert(0, '0');
                        carry = true;
                    }
                }
            } else {
                if (a.charAt(i) == '1') {
                    if (b.charAt(j) == '0') {
                        sum.insert(0, '1');
                        carry = false;
                    } else {
                        sum.insert(0, '0');
                        carry = true;
                    }
                } else {
                    sum.insert(0, b.charAt(j));
                }
            }
            i--;
            j--;
        }
        if (carry) {
            if (i >= 0) {
                while (i >= 0) {
                    if (a.charAt(i) == '1') {
                        if (carry) {
                            carry = true;
                            sum.insert(0, '0');
                        } else {
                            sum.insert(0, a.charAt(i));
                            carry = false;
                        }
                    } else {
                        if (carry) {
                            carry = false;
                            sum.insert(0, '1');
                        } else {
                            carry = false;
                            sum.insert(0, a.charAt(i));
                        }

                    }
                    i--;
                }
            } else if (j >= 0) {
                while (j >= 0) {
                    if (b.charAt(j) == '1') {
                        if (carry) {
                            carry = true;
                            sum.insert(0, '0');
                        } else {
                            sum.insert(0, b.charAt(j));
                            carry = false;
                        }
                    } else {
                        if (carry) {
                            carry = false;
                            sum.insert(0, '1');
                        } else {
                            carry = false;
                            sum.insert(0, b.charAt(j));
                        }

                    }
                    j--;
                }
            } else {
                sum.insert(0, '1');
                carry=false;
            }

        } else {
            if (i >= 0) {
                while (i >= 0) {
                    sum.insert(0, a.charAt(i));
                    i--;
                }
            } else if (j >= 0) {
                while (j >= 0) {
                    sum.insert(0, b.charAt(j));
                    j--;
                }
            } else {

            }
        }
        if (carry) sum.insert(0,1);
        return sum.toString();
    }
}
