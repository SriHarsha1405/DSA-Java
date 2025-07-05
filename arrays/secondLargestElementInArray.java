public class secondLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 90, 20};
        System.out.println(secondLargestElement(arr));
    }

    private static int secondLargestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int n : arr){
            if(n > max){
                secondMax = max;
                max = n;
            } else if(n > secondMax && n < max){
                secondMax = n;
            }
        }
        if(secondMax == Integer.MIN_VALUE){
            return -1;
        }
        return secondMax;
    }
}
