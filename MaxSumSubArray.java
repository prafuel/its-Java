
public class MaxSumSubArray {
    public static int getSum(int low, int high, int[] arr) {
        int sum = 0;
        for (int i = low; i <= high; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static int max(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }

    public static int bruteForce(int[] arr) {
        int n = arr.length;
        int sum = Integer.MIN_VALUE;

        for (int i = 0; i <= n; i++) {
            for (int j = i; j < n; j++) {
                int new_sum = getSum(i, j, arr);
                sum = max(new_sum, sum);
            }
        }

        return sum;
    }

    public static int better(int[] arr) {
        int n = arr.length;
        int sum = Integer.MIN_VALUE;

        for (int i = 0; i <= n; i++) {
            int new_sum = 0;
            for (int j = i; j < n; j++) {
                new_sum += arr[j];
                sum = max(new_sum, sum);
            }
        }

        return sum;
    }

    public static int optimal(int[] arr) {
        int n = arr.length;
        
        int maxi = arr[0];
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            if(sum < 0){
                sum = 0;
            }

            maxi = max(sum,maxi);
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = { -1,-2,-1,3,2,4,2,-12,-1000};
        System.out.println(bruteForce(arr));
        System.out.println(better(arr));
        System.out.println(optimal(arr));
    }
}
