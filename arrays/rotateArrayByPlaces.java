public class rotateArrayByPlaces {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        leftRotateArrayByPlaces(arr, 3);
    }

    private static void leftRotateArrayByPlaces(int[] arr, int k) {
        int n = arr.length;
        int[] temp = new int[n];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i + k];
        }
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - n + k];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
