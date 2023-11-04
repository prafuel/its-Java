import java.util.Set;
import java.util.HashSet;

public class FindMissingNumber {

    public static int optimal1(int[] arr, int n) {
        // using total sum
        int sum = 0;
        for (int item : arr) {
            sum += item;
        }

        int totalSum = (n * (n + 1)) / 2;
        return totalSum - sum;
    }

    public static int optimal2(int[] arr, int n) {
        // using XOR
        int xor = 0;
        for (int item : arr) {
            xor = xor ^ item;
        }

        int totalXOR = 0;
        for (int i = 1; i <= n; i++) {
            totalXOR = totalXOR ^ i;
        }

        return totalXOR ^ xor;
    }

    public static int bruteForce(int[] arr, int n) {
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int n = 6;
        int[] arr = { 1, 4, 3, 5 ,2};

        System.out.println(bruteForce(arr, n));
        System.out.println(optimal1(arr, n));
        System.out.println(optimal2(arr, n));
    }
}
