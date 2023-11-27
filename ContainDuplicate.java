
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class ContainDuplicate {
    public static boolean bruteForce(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean better1(int[] arr) {
        Set<Integer> set = new HashSet<Integer>();

        for(int item : arr) {
            if(set.contains(item)) {
                return true;
            }
            else{
                set.add(item);
            }
        }
        return false;
    }

    public static boolean better2(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            int j = i + 1;
            if(arr[i] == arr[j]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3};
        System.out.println(bruteForce(arr));
        System.out.println(better1(arr));
        System.out.println(better2(arr));
    }
}