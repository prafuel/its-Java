
public class ProductOfAllExceptSelf {
    public static int[] withUsingDivision(int[] arr) {
        int prod = 1;
        for(int i = 0; i < arr.length; i++){
            prod = prod * arr[i];
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = prod / arr[i];
        }

        return arr;
    }

    public static int[] withoutUsingDivision(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = 1;
        right[n-1] = 1;

        // for left 
        for(int i = 1; i < n; i++){
            left[i] = left[i-1] * arr[i-1];
        }

        // for right
        for(int i = n-2; i > -1; i--){
            right[i] = right[i+1] * arr[i+1];
        }

        // result
        for(int i = 0; i < n; i++){
            arr[i] = left[i] * right[i];
        }

        return arr;
    }

    public static void main(String args[]) {
        int[] arr = {1,2,3,4}; // without using division operation
        // output = {24, 12, 8, 6}

        int n = arr.length;

        // using division
        // arr = withUsingDivision(arr);

        // without division
        arr = withoutUsingDivision(arr);

        // printing result
        for(int i = 0; i < n; i++){
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println();
    }
}