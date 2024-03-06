import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Question1Test {

    @Test
    public void testMt10() {
        // Test case 1
        int result1 = Question1.findOccurrences(10, 5);
        assertEquals(2, result1);
    }

    @Test
    public void testMt20() {
        // Test case 2
        int result2 = Question1.findOccurrences(20, 10);
        assertEquals(4, result2);
    }

    // Test case 3
    @Test
    public void testMt15() {
        int result3 = Question1.findOccurrences(15, 3);
        assertEquals(2, result3);
    }

    @Test
    public void testMt8() {// Test case 4
        int result4 = Question1.findOccurrences(8, 4);
        assertEquals(3, result4);
    }

    @Test
    public void testMt24() { // Test case 5
        int result5 = Question1.findOccurrences(24, 100);
        assertEquals(3, result5);
    }

    @Test
    public void testMt25() { // Test case 5
        int result5 = Question1.findOccurrences(25, 100);
        assertEquals(5, result5);
    }

    @Test
    public void testMt25_2() { // Test case 5
        int result5 = Question1.findOccurrences(25, 120);
        assertEquals(8, result5);
    }
}