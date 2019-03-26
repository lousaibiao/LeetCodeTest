import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void searchInsert2() {
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 5;
        Assertions.assertEquals(2, solution.searchInsert(nums, target));
    }

    @Test
    void searchInsert1() {
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 2;
        Assertions.assertEquals(1, solution.searchInsert(nums, target));
    }

    @Test
    void searchInsert4() {
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 7;
        Assertions.assertEquals(4, solution.searchInsert(nums, target));
    }

    @Test
    void searchInsert0() {
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 0;
        Assertions.assertEquals(0, solution.searchInsert(nums, target));
    }

    @Test
    void searchInsert1Too() {
        int[] nums = new int[]{1};
        int target = 2;
        Assertions.assertEquals(1, solution.searchInsert(nums, target));
    }

    @Test
    void searchInsert1Three() {
        int[] nums = new int[]{1};
        int target = 0;
        Assertions.assertEquals(0, solution.searchInsert(nums, target));
    }
}
