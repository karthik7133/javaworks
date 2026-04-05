package dsa;

public class leet_121 {
	public static void main(String[] args) {
		System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
	}
	public static  int maxProfit(int[] prices) {
		if (prices == null || prices.length == 0) return 0;

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            // 1. Update the lowest price seen so far
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            // 2. Check if selling today gives a better profit than before
            else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }
}
