package LeetCode_problems;
import java.util.*;
public class _121_Best_Time_to_Buy_and_Sell_Stock {
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        String[] input = sc.nextLine().split(" ");

	        int[] prices = new int[input.length];

	        for(int i = 0; i < input.length; i++) {
	            prices[i] = Integer.parseInt(input[i]);
	        }

	        int minPrice = prices[0];
	        int maxProfit = 0;

	        for(int i = 1; i < prices.length; i++) {

	            if(prices[i] < minPrice) {
	                minPrice = prices[i];
	            }

	            int profit = prices[i] - minPrice;

	            if(profit > maxProfit) {
	                maxProfit = profit;
	            }
	        }

	        System.out.println(maxProfit);
	    }
	}



	