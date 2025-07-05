import java.util.*;

public class zerosToEnd {
    public static void main(String[] args) {
        int[] arr = {10, 0, 20, 40, 0, 60};
        moveZeroesToEnd(arr);
    }

    private static void moveZeroesToEnd(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i : arr){
            if(i != 0){
                al.add(i);
            }
        }

        int s = al.size();

        for(int i=0; i<s; i++){
            arr[i] = al.get(i);
        }
        for(int i=s; i<n; i++){
            arr[i] = 0;
        }

        for(int a : arr){
            System.out.print(a + " ");
        }
    }
}
