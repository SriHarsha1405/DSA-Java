public class nextPermutation {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        nextPermutationOfArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void nextPermutationOfArray(int[] nums) {
        // Your code goes here
        int n = nums.length;

        int pivot = -1;
        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }

        if(pivot == -1){
            reverse(nums,0,n-1);
            return;
        }

        for(int i=n-1; i>pivot; i--){
            if(nums[i] > nums[pivot]){
                swap(nums,i,pivot);
                break;
            }
        }
        reverse(nums,pivot+1,n-1);
    }
    private static void reverse(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start++ ,end--);
        }
    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

