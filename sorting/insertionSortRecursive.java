public class insertionSortRecursive {
    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 5, 3};
        insertionSort(arr);
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }

    private static void insertionSort(int[] nums) {
        is(nums, 0, nums.length);
    }

    private static void is(int[] arr, int i, int n){
        if (i == n) return;

        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        is(arr, i+1, n);
    }
}
