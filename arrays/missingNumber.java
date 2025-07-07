import java.util.*;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr= {1,2,4,5};
        int n = arr.length;
        System.out.println(missingNum(arr, n+1));
    }

    private static int missingNum(int[] arr, int l) {
        int sum1 = (l * ( l + 1)) / 2;

        int sum2 = 0;
        for(int ele : arr){
            sum2 = sum2 + ele;
        }

        return sum1 - sum2;
    }
}
