import java.util.*;

public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {20, 20, 60, 60, 60, 40, 40, 90, 0, 0, 90};
        int k = removeDuplicates(arr);
        System.out.println(k);
        for(int i=0; i<k; i++){
            System.out.print(arr[i] + " ");
        }
        for(int i=k; i<arr.length; i++){
            System.out.print("_ ");
        }
    }

    private static int removeDuplicates(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            hs.add(arr[i]);
        }
        int k = hs.size();
        int j=0;
        for(int n : hs){
            arr[j++] = n;
        }
        return k;
    }
}
