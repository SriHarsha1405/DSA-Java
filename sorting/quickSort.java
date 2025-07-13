public class quickSort {
    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 5, 3};
        quickSorting(arr);
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }

    private static void quickSorting(int[] nums) {
        qs(nums, 0, nums.length-1);
    }
    private static void qs(int[] nums, int low, int high){
        if(low < high){
            int pi = part(nums, low, high);
            qs(nums, low, pi-1);
            qs(nums, pi+1, high);
        }
    }
    private static int part(int[] nums, int low, int high){
        int pivot = nums[high];
        int i = low - 1;
        for(int j = low; j <= high-1; j++){
            if(nums[j] < pivot){
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i+1, high);
        return i+1;
    }
    private static void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
