public class Question2 {
    public static void main(String[] args) {
        int[] prices = {9, 11, 8, 5, 7, 10};
        int purchasePrice = 11;
        System.out.println("max loss:"+maxStockLoss(prices, purchasePrice));
    }

    public static int maxStockLoss(int[] prices, int purchasePrice) {
        int maxLoss = 0;
        int minPrice = prices[0];
        int maxPrice = 0;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxPrice = Math.max(maxPrice, price);
        }
        System.out.println("minPrice: " + minPrice);
        System.out.println("maxPrice: " + maxPrice);
        System.out.println("purchasePrice: " + purchasePrice);
        maxLoss = purchasePrice - minPrice;

        return maxLoss;
    }
}