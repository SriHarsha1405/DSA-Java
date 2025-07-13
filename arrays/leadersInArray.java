import java.util.*;

public class leadersInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 1, 2};
        ArrayList<Integer> al = leaders(arr);
        for(int ele : al){
            System.out.print(ele + " ");
        }
    }

    public static ArrayList<Integer> leaders(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<nums.length;i++){
            boolean leader = true;
            for(int j=i+1; j<nums.length; j++){
                if(nums[j] > nums[i]){
                    leader = false;
                    break;
                }
            }
            if(leader == true){
                al.add(nums[i]);
            }
        }
        return al;
    }
}
