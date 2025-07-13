public class bubbleSortRecursive {
    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 5, 3};
        bubbleSort(arr);
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }

    private static void bubbleSort(int[] nums) {
        bs(nums, nums.length);
    }

    private static void bs(int[] nums, int n){
        if(n == 1) return;
        for(int j=0; j<=n-2; j++){
            if(nums[j] > nums[j+1]){
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
            }
        }
        bs(nums, n-1);
    }
}
