public class HelloWorld {
    public static void main(String[] args) {
        long val = -(long) Math.pow(2, 31);
        System.out.println(val);
        int x = 1563847412;
        HelloWorld helloWorld = new HelloWorld();
        System.out.println("初始值:" + x);
        int revX = helloWorld.Reverse(x);
        System.out.println("Reverse:" + revX);

    }

    public int Reverse(int x) {
        if (x == -2147483648)
            return 0;
        boolean isNegative = x < 0;
        int positiveX = isNegative ? -x : x;
        int[] nums = new int[10];
        int digits = 10;
        int index = 0;
        int sum = 0;
        while (positiveX / 10 > 0) {
            nums[index++] = positiveX % 10;
            positiveX = positiveX / 10;
        }
        nums[index] = positiveX % 10;
        //2147483648
        //2147483648
        if (index == 9) {
            if (nums[0] > 2
                    || (nums[0] == 2 && nums[1] > 1)
                    || (nums[0] == 2 && nums[1] == 1 && nums[2] > 4)
                    || (nums[0] == 2 && nums[1] == 1 && nums[2] == 4 && nums[3] > 7)
                    || (nums[0] == 2 && nums[1] == 1 && nums[2] == 4 && nums[3] == 7 && nums[4] > 4)
                    || (nums[0] == 2 && nums[1] == 1 && nums[2] == 4 && nums[3] == 7 && nums[4] == 4 && nums[5] > 8)
                    || (nums[0] == 2 && nums[1] == 1 && nums[2] == 4 && nums[3] == 7 && nums[4] == 4 && nums[5] == 8 && nums[6] > 3)
                    || (nums[0] == 2 && nums[1] == 1 && nums[2] == 4 && nums[3] == 7 && nums[4] == 4 && nums[5] == 8 && nums[6] == 3 && nums[7] > 6)
                    || (nums[0] == 2 && nums[1] == 1 && nums[2] == 4 && nums[3] == 7 && nums[4] == 4 && nums[5] == 8 && nums[6] == 3 && nums[7] == 6 && nums[8] > 4)
                    || (nums[0] == 2 && nums[1] == 1 && nums[2] == 4 && nums[3] == 7 && nums[4] == 4 && nums[5] == 8 && nums[6] == 3 && nums[7] == 6 && nums[8] == 4 && nums[9] > 8)
            ) {
                return 0;
            }
        }
//        System.out.println("总位数:" + (index + 1) + "位");
//        showDigits(nums);
        int factor = 1;
        for (int i = index; i >= 0; i--) {
            sum += factor * nums[i];
            factor *= 10;
        }
        return isNegative ? -sum : sum;
    }

    private void showDigits(int[] nums) {
        for (int index = 0; index < nums.length; index++) {
            System.out.println("第" + index + "位:" + nums[index]);
        }
    }
}
