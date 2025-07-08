import java.util.*;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, -2, 7, -4};
        System.out.println(maxSubArray(arr));
    }

    private static int maxSubArray(int[] nums) {
        //kadanes Algorithm
        int maxi = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum > maxi) {
                maxi = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    }

}
