public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        int x = 1234;
        System.out.println(helloWorld.isPalindrome(x));
        x = 121;
        System.out.println(helloWorld.isPalindrome(x));
        x = 10;
        System.out.println(helloWorld.isPalindrome(x));
        x=11;
        System.out.println(helloWorld.isPalindrome(x));

    }

    public boolean isPalindrome(int x) {
//        System.out.println("x:" + x);
        if (x < 0)
            return false;
        int[] digits = new int[10];
        int index = 0;
        while (x >= 10) {
            digits[index++] = x % 10;
            x /= 10;
        }
        digits[index] = x;
        for (int i = 0; i <= index / 2; i++) {
            if (digits[i] != digits[index - i])
                return false;
        }
//        showDigits(digits);
        return true;
    }

    private void showDigits(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
