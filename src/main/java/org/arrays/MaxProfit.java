package org.arrays;

public class MaxProfit {

    public static void main(String[] args) {
//        System.out.println(optMaxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(optMaxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int sub = prices[j] - prices[i];
                if (sub >= 0 && sub > maxProfit) {
                    maxProfit = sub;
                }
            }
        }

        return maxProfit;
    }

    public static int optMaxProfit(int[] prices) {
        int lowest = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < lowest) {
                lowest = prices[i];
            }
            profit = Math.max(profit, prices[i] - lowest);
        }

        return profit;
    }
}
