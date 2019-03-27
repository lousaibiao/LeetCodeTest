import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void addBinary0() {
        String a = "0", b = "0";
        Assertions.assertEquals("0", solution.addBinary(a, b));
    }

    @Test
    void addBinary1() {

        String a = "1", b = "0";
        Assertions.assertEquals("1", solution.addBinary(a, b));
    }

    @Test
    void addBinary10() {

        String a = "1", b = "1";
        Assertions.assertEquals("10", solution.addBinary(a, b));
    }
    @Test
    void addBinary1000() {

        String a = "11", b = "1";
        Assertions.assertEquals("100", solution.addBinary(a, b));
    }
    @Test
    void addBinary1000Too() {

        String a = "1", b = "11";
        Assertions.assertEquals("100", solution.addBinary(a, b));
    }
    @Test
    void addBinary11() {

        String a = "10", b = "1";
        Assertions.assertEquals("11", solution.addBinary(a, b));
    }

    @Test
    void addBinary10001() {

        String a = "10000", b = "1";
        Assertions.assertEquals("10001", solution.addBinary(a, b));
    }

    @Test
    void addBinary110() {

        String a = "101", b = "1";
        Assertions.assertEquals("110", solution.addBinary(a, b));
    }


}
