import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.

        int minPrice = prices.get(0);
        int maxProfit = 0;

        for(int i=0; i<prices.size(); i++) {
            int currPrice = prices.get(i);
            if(currPrice - minPrice > maxProfit) {
                maxProfit = currPrice - minPrice;
            }
            if(minPrice > prices.get(i)) {
                minPrice = prices.get(i);
            }
        }
        return maxProfit;
    }
}
