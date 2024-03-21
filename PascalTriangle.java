import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    // 1] For eg. c = 4 r = 2 what will be the value 
    // 2] For eg. n = 4 print the row
    // 3] FOr n = 4 print whole pascal triangle

    public static int nCr(int n, int r){
        int res = 1;
        for(int i = 0; i < r; i++){
            res = res * (n - i);
            res = res / (i+1);
        }
        return res;
    }

    public static List<Integer> question2(int n){
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++) {
            list.add(nCr(n-1, i-1));
        }
        return list;
    }

    public static void question3(int n){
        for(int i = 0; i < n; i++){
            // for values
            for(int j = 0; j <= i; j++){
                System.out.print(nCr(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static int question1(int col, int row){
        return nCr(col-1,row-1);
    }
    public static void main(String[] args) {
        // System.out.println(question1(15, 4));
        // System.out.println(question2(5));
        question3(15);
    }
}
