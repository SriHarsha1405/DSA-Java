import java.util.*;

public class numberOnce {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {
        //your code goes here
        int xor = 0;
        for(int i : nums){
            xor = xor ^ i;
        }
        return xor;
    }
}
