public class RotateElementByk{

    public static void makeReverse(int[] arr, int low, int high) {

        while(low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void optimal(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        makeReverse(arr, n-k, n-1);
        makeReverse(arr, 0, n-k-1);
        makeReverse(arr, 0, n-1);
    }

    public static int[] bruteForce(int[] arr, int k) {
        int n = arr.length;
        int[] ans = new int[n];

        for(int i = 0; i < n; i++) {
            ans[(i+k)%n] = arr[i];
        }
        return ans;
    }

    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 7;
        
        optimal(arr, k);
        // arr = bruteForce(arr, k);

        for(int item : arr) {
            System.out.print("|" + item + "|");
        }
        System.out.println();
    }
}