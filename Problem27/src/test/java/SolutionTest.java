import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class SolutionTest {

    private final Solution solution=new Solution();
    @Test
    void removeElement2(){
        int[] nums=new int[] {3,2,2,3};
        int value=3;
        assertEquals(2,solution.removeElement(nums,value));
    }

    @Test
    void removeElement5(){
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int value = 2;
        assertEquals(5,solution.removeElement(nums,value));
    }

}
