public class ProductArrayExceptSelf {
    public static int[] bruteForce(int[] arr, int n) {
        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
            int product = 1;
            for(int j = 0; j < n; j++) {
                if(i != j) {
                    product = product * arr[j];
                }
            }
            ans[i] = product;
        }

        return ans;
    }

    public static int[] better1(int[] arr, int n) {
        int product = 1;
        for(int i : arr) {
            product = product * i;
        }

        // System.out.println(product);

        for(int i = 0; i < n; i++) {
            arr[i] = product / arr[i];
        }
        return arr;
    }
    
    public static int[] better2(int[] arr, int n) {
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = 1;
        right[n-1] = 1;;

        // left array
        for(int i = 1; i < n; i++) {
            left[i] = left[i-1] * arr[i-1];
        }

        // right array
        for(int j = n - 2; j > -1; j--) {
            right[j] = right[j+1] * arr[j+1];
        }

        for(int k = 0; k < n; k++) {
            arr[k] = left[k] * right[k];
        }

        return arr;
    }

    public static int[] optimal(int[] arr, int n) {
        int[] right = new int[n];
        right[n-1] = 1;
        for(int i = n - 2; i > -1; i--) {
            right[i] = right[i+1] * arr[i+1];
        }

        int left = arr[0];
        for(int i = 1; i < n; i++) {
            right[i] = right[i] * left;
            left = left * arr[i];
        }

        return right;
    }

    public static void main(String[] args) { 
        int[] arr = {1,2,3,4};
        int n = arr.length;
        // arr = bruteForce(arr, n);
        arr = better2(arr,n);
        for(int i : arr) {
            System.out.print("| " + i +" | ");
        }
        System.out.println();
    }
}
