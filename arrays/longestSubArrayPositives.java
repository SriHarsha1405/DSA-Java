import java.util.*;

public class longestSubArrayPositives {
    public static void main(String[] args) {
        int[] arr = {10,5,2,7,1,9};
        int k = 15;
        System.out.println(LenOfLongestSubArrayOfSumK(arr, k));
    }

    private static int LenOfLongestSubArrayOfSumK(int[] nums, int k) {
        int n = nums.length;
        int len = 0;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += nums[j];

                if(sum == k){
                    len = Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }
}
