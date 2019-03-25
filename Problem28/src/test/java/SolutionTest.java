import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void strStr2() {
        Assertions.assertEquals(2, solution.strStr("hello", "ll"));
    }

    @Test
    void strStrMinus1() {
        Assertions.assertEquals(-1, solution.strStr("aaaaa", "bba"));
    }

    @Test
    void strStr0() {
        Assertions.assertEquals(0, solution.strStr("hello", "hello"));
    }

    @Test
    void strStrSubString2() {
        Assertions.assertEquals(2, solution.strStrSubString("hello", "ll"));
    }

    @Test
    void strStrSubStringMinus1() {
        Assertions.assertEquals(-1, solution.strStrSubString("aaaaa", "bba"));
    }

    @Test
    void strStrSubString0() {
        Assertions.assertEquals(0, solution.strStrSubString("hello", "hello"));
    }

    @Test
    void strStrSubString2Too(){
        Assertions.assertEquals(2,solution.strStrSubString("aabbc","bbc"));
    }

    @Test
    void strStrSubStringMinus1Too(){
        Assertions.assertEquals(-1,solution.strStrSubString("aabbc","bbcc"));
    }

}