import java.util.Arrays;

public class arraySorted {
    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 90, 20};
        System.out.println(isSorted(arr));
    }

    private static boolean isSorted(int[] arr) {
        int n = arr.length;
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = arr[i];
        }
        Arrays.sort(arr);
        return arr1.equals(arr);
    }
}
