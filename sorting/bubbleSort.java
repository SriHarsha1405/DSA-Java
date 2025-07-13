public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 5, 3};
        bubbleSorting(arr);
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }

    private static void bubbleSorting(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}
