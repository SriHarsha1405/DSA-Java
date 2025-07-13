public class setMatrixZeros {
    public static void main(String[] args) {
        int[][] mat ={{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(mat);
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void setZeroes(int[][] matrix) {
        // Your code goes here
        int n = matrix.length;
        int m = matrix[0].length;
        int col[] = new int[m];
        int row[] = new int[n];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if (row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
