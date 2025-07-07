import java.util.*;

public class maxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr ={1,1,0,0,1,1,1,0,1,1};
        System.out.println(maximumConsecutiveOnes(arr));
    }

    private static int maximumConsecutiveOnes(int[] nums) {
        int n = nums.length;

        int ones = 0;

        int max = 0;

        for(int i=0; i<n; i++){
            if(nums[i] == 1){
                ones++;
                max = Math.max(max,ones);
            } else{
                ones = 0;
            }
        }
        return max;
    }
}
