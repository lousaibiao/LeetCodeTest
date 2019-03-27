import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    private final Solution solution= new Solution();
    @Test
    void convertToTitleA() {
        int n = 1;
        Assertions.assertEquals("A",solution.convertToTitle(n));
    }
    @Test
    void convertToTitleZ() {
        int n = 26;
        Assertions.assertEquals("Z",solution.convertToTitle(n));
    }
    @Test
    void convertToTitleAB() {
        int n = 28;
        Assertions.assertEquals("AB",solution.convertToTitle(n));
    }
    @Test
    void convertToTitleZY() {
        int n = 701;
        Assertions.assertEquals("ZY",solution.convertToTitle(n));
    }
}
