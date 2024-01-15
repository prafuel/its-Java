
public class SetZeroesMat {

    public static int[][] matSetColumn(int[][] mat, int col_val, int row, int col) {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(i == col_val) {
                    mat[i][j] = -1;
                }
            }
        }
        
        return mat;
    }

    public static int[][] matSetRow(int[][] mat, int row_val, int row, int col) {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(j == row_val) {
                    mat[i][j] = -1;
                }
            }
        }
        
        return mat;
    }

    public static int[][] bruteForce(int[][] mat, int c, int r) {
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                if (mat[i][j] == 0) {
                    mat = matSetColumn(mat, i, r, c);
                    mat = matSetRow(mat, j, r, c);
                }
            }
        }

        for(int i = 0; i < c; i++) {
            for(int j = 0; j < r; j++) {
                if(mat[i][j] == -1) {
                    mat[i][j] = 0;
                }
            }
        }

        return mat;
    }

    public static int[][] better(int[][] mat, int col, int row) {
        int[] col_arr = new int[col];
        int[] row_arr = new int[row];

        for(int i = 0; i < col; i++) {
            for(int j = 0; j < row; j++) {
                if(mat[i][j] == 0) {
                    col_arr[i] = 1;
                    row_arr[j] = 1;
                }
            }
        }

        for(int i = 0; i < col; i++) {
            for(int j = 0; j < row; j++) {
                if(col_arr[i] == 1 || row_arr[j] == 1) {
                    mat[i][j] = 0;
                }
            }
        }

        return mat;
    }

    public static void main(String args[]) {
        int c = 4;
        int r = 3;
        int[][] mat = {
                { 1, 0, 1 },
                { 1, 1, 1 },
                { 1, 1, 1 },
                { 0, 1, 1 }
        };

        // mat = bruteForce(mat, c, r);
        mat = better(mat, c, r);

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print("| " + mat[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
