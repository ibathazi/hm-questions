import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Question2Test {
    
    @Test
    public void testMaxStockLoss() {
        int[] prices = {10, 8, 12, 9, 15};
        int purchasePrice = 10;
        int expected = 2; // 10-8=2
        int actual = Question2.maxStockLoss(prices, purchasePrice);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxStockLoss2() {
        int[] prices = {9, 11, 8, 5, 7, 10};
        int purchasePrice = 11;
        int expected = 6; // 11-5= 6
        int actual = Question2.maxStockLoss(prices, purchasePrice);
        assertEquals(expected, actual);
    }
    @Test
    public void testMaxStockLoss3() {
        int[] prices = {10, 8, 12, 9, 15};
        int purchasePrice = 15;
        int expected = 7; // 15-8=7 
        int actual = Question2.maxStockLoss(prices, purchasePrice);
        assertEquals(expected, actual);
    }
}