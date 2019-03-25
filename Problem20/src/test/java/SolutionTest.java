import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void isValidTrue(){
        String s = "()";
        assertEquals(true,solution.isValid(s));
    }
    @Test
    void isValidTrue1(){
        String s= "()[]{}";
        assertEquals(true,solution.isValid(s));
    }

    @Test
    void isValidFalse(){
        String s= "(]";
        assertEquals(false,solution.isValid(s));
    }

    @Test
    void  isValidFalse2(){
        String s= "))))";
        assertEquals(false,solution.isValid(s));
    }

    @Test
    void isValidFalse3(){
        String s = "(";
        assertEquals(false,solution.isValid(s));
    }

}
