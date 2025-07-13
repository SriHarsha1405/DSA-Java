public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 5, 3};
        mergeSorting(arr);
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }

    private static void mergeSorting(int[] nums) {
        ms(nums, 0, nums.length-1);
    }
    private static void ms(int[] nums, int left, int right){
        if(left < right){
            int mid = left + (right - left) / 2;
            ms(nums, left, mid);
            ms(nums, mid+1, right);
            merge(nums, left, mid, right);
        }
    }
    private static void merge(int[] nums, int l, int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;
        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i=0; i<n1; i++){
            L[i] = nums[l+i];
        }

        for(int j=0; j<n2; j++){
            R[j] = nums[m+1+j];
        }

        int i=0;
        int j=0;
        int k=l;
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                nums[k] = L[i];
                i++;
            } else{
                nums[k] = R[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            nums[k] = L[i];
            i++;
            k++;
        }

        while(j < n2){
            nums[k] = R[j];
            j++;
            k++;
        }
    }
}
