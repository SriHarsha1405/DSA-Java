import java.util.*;

public class spiralMatrix {
    public static void main(String[] args) {
        int[][] mat =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> l = spiralOrder(mat);
        for(int ele : l){
            System.out.print(ele + " ");
        }
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> spial = new ArrayList<>();

        int top = 0, left = 0, bottom = n - 1, right = m - 1;

        while(top <= bottom && left <= right){

            for(int i=left; i<=right; i++){
                spial.add(matrix[top][i]);
            }
            top++;

            for(int i=top; i<=bottom; i++){
                spial.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom){
                for (int i = right; i >= left; i--){
                    spial.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--){
                    spial.add(matrix[i][left]);
                }
                left++;
            }
        }
        return spial;
    }
}
