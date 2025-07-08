import java.util.*;

public class MajoirtyNby2 {
    public static void main(String[] args) {
        int[] arr = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println(majorityElement(arr));
    }

    private static int majorityElement(int[] nums) {
        int n = nums.length;
        int size = n / 2;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int ele : nums){
            mp.put(ele, mp.getOrDefault(ele,0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(value > size){
                return key;
            }
        }
        return -1;
    }
}
