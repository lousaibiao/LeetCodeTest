class Solution {
    public int searchInsert(int[] nums, int target) {
        int leftIndex = 0, rightIndex = nums.length - 1;
        int midIndex = (leftIndex + rightIndex) / 2;
        while (leftIndex != rightIndex) {
            //{1, 3, 5, 6}
            if (nums[midIndex] == target) return midIndex;
//            if (rightIndex == leftIndex + 1) return leftIndex + 1;
            if (nums[midIndex] > target) {
                if (rightIndex != midIndex)
                    rightIndex = midIndex;
                else break;
            } else {
                if (leftIndex != midIndex)
                    leftIndex = midIndex;
                else break;
            }
            midIndex = (rightIndex + leftIndex) / 2;
        }
        if (leftIndex + 1 == rightIndex || leftIndex == rightIndex) {
            if (target > nums[rightIndex]) return rightIndex + 1;
            if (target > nums[leftIndex]) return leftIndex + 1;
            if (target <= nums[leftIndex]) {
                if (leftIndex == 0) return 0;
                return leftIndex - 1;
            }
        }

        return 0;

    }
}