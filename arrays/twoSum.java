import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,0,-1,3};
        int[] res = twoSumOfArray(arr,9);
        for(int i : res){
            System.out.print(i + " ");
        }
    }

    private static int[] twoSumOfArray(int[] arr, int target) {
        int n = arr.length;
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0; i<n; i++){
            int num = arr[i];
            int req = target - num;
            if(mp.containsKey(req)){
                ans[0] = mp.get(req);
                ans[1] = i;
                return ans;
            }
            mp.put(arr[i],i);
        }
        return ans;
    }

}
