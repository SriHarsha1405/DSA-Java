import java.util.*;

public class union {
    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 90, 20};
        int[] nums = {50, 20, 60, 80, 40};
        int[] union = unionOf(arr,nums);
        for(int ele : union){
            System.out.print(ele + " ");
        }

    }

    private static int[] unionOf(int[] arr, int[] nums) {
        TreeSet<Integer> hs = new TreeSet<>();

        for(int i : arr){
            hs.add(i);
        }

        for(int j : nums){
            hs.add(j);
        }

        int[] union = new int[hs.size()];

        int index = 0;

        for(int ele : hs){
            union[index] = ele;
            index++;
        }

        return union;
    }
}
