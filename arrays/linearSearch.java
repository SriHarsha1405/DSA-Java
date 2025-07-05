public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 90, 20};
        System.out.println(linearSearching(arr, 20));
    }

    private static int linearSearching(int[] arr, int target) {
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
