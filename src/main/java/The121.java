import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class The121 {
    public static int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int [][]dp = new int[prices.length][2];
        dp[0][1] = -prices[0];//1代表买入
        dp[0][0] = 0;//0代表不买入
        for (int i = 1; i <prices.length ; i++) {

            dp[i][0] = Math.max(dp[i-1][0],prices[i]+dp[i-1][1]);
            dp[i][1] = Math.max(dp[i-1][1],-prices[i]);

        }
        return dp[prices.length-1][0];
    }


    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};

        maxProfit(prices);
    }
}
