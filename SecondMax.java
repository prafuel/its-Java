import java.util.HashSet;
import java.util.Set;

public class SecondMax {

    public static int bruteForce(int[] arr) {
        int n = arr.length;
        Set<Integer> set = new HashSet<Integer>();

        for(int item : arr) {
            set.add(item);
        }

        int j = 0;
        n = set.size();
        for(int item : set) {
            if(j == n - 2) {
                return item;
            }
            j++;
        }

        return -1;
    }

    public static int better(int[] arr) {
        int n = arr.length;

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        int secMax = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }
        }

        System.out.println(secMax);
        return secMax;
    }

    public static int optimal(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                min = max;
                max = arr[i];
            }
        }

        return min;
    }
    
    public static void main(String args[]) {
        int arr[] = {1,2,4,5,6,6,6,3,5,6};

        // System.out.println(bruteForce(arr));
        // System.out.println(better(arr));
        System.out.println(optimal(arr));
    }
}
