public class MaxSumSubArray {
    public static int getSum(int low, int high, int[] arr) {
        int sum = 0;
        for (int i = low; i <= high; i++) {
            sum = sum + arr[i];
        }
        // System.out.println("low : " + low + " high : " + high);
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

        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int new_sum = getSum(i, j, arr);
                sum = max(new_sum, sum);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(bruteForce(arr));
    }
}
