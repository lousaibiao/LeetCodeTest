import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    private final Solution solution = new Solution();


    @Test
    void removeDuplicatesLength2() {
        int[] nums = new int[]{1, 1, 2};
        Assertions.assertEquals(2, solution.removeDuplicates(nums));
    }

    @Test
    void removeDuplicatesLength5() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Assertions.assertEquals(5, solution.removeDuplicates(nums));
    }

    @Test
    void removeDuplicatesLenght3() {
        int[] nums = new int[]{1, 2, 3};
        Assertions.assertEquals(3, solution.removeDuplicates(nums));
    }
    @Test
    void removeDuplicatesLength1(){
        int[] nums = new int[]{1};
        Assertions.assertEquals(1,solution.removeDuplicates(nums));
    }
}
