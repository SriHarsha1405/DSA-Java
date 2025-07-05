public class largestElementInArray {
    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 90, 20};
        System.out.println(largestElement(arr));
    }

    private static int largestElement(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
