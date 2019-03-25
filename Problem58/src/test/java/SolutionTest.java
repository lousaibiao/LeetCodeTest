import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void length5() {
        String s = "Hello world";
        assertEquals(5, solution.lengthOfLastWord(s));
    }

    @Test
    void length1() {
        String s = " d";
        assertEquals(1, solution.lengthOfLastWord(s));
    }

    @Test
    void length1Too() {
        String s = "a ";
        assertEquals(1, solution.lengthOfLastWord(s));
    }

    @Test
    void length1Three() {
        String s = "a  ";
        assertEquals(1, solution.lengthOfLastWord(s));
    }

    @Test
    void length2() {
        String s = "aa aa ";
        assertEquals(2, solution.lengthOfLastWord(s));
    }

    @Test
    void length0() {
        String s = " ";
        assertEquals(0, solution.lengthOfLastWord(s));
    }

}