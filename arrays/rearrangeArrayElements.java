import java.util.*;

public class rearrangeArrayElements {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, -1, -3, -4};
        int[] rearranged = rearrangeArray(arr);
        for(int ele : rearranged){
            System.out.print(ele + " ");
        }
    }

    private static int[] rearrangeArray(int[] nums) {
        int pIndex = 0;
        int nIndex = 1;
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){
                ans[nIndex] = nums[i];
                nIndex += 2;
            } else{
                ans[pIndex] = nums[i];
                pIndex += 2;
            }
        }
        return ans;
    }
}
