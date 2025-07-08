import java.util.*;
public class stockBySell {
    public static void main(String[] args) {
        int[] arr = {10, 7, 5, 8, 11, 9};
        System.out.println(stockBuyAndSell(arr));
    }

    private static int stockBuyAndSell(int[] arr) {
        int n = arr.length;
        int mini = arr[0];
        int profit = 0;
        for(int i=1; i<n; i++){
            int cost = arr[i] - mini;
            profit = Math.max(profit, cost);
            mini = Math.min(mini, arr[i]);
        }
        return profit;
    }
}
