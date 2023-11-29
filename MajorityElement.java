
import java.util.Map;
import java.util.HashMap;

public class MajorityElement {
    public static int bruteForce(int[] arr) {
        int n = arr.length;

        int[] maxCount = { 0, 0 };
        for (int i = 0; i < n; i++) {
            int current = i;
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[current]) {
                    count++;
                }

                if (count > maxCount[1]) {
                    maxCount[0] = arr[current];
                    maxCount[1] = count;
                }
            }
        }

        return maxCount[0];
    }

    public static int better(int[] arr) {
        int n = arr.length;

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int item : arr) {
            // map.put(item, 0);
            int current = item;
            if (map.containsKey(current)) {
                map.put(current, map.get(current) + 1);
            } 
            else {
                map.put(current, 1);
            }
        }

        int maxKey = -1;
        int maxCount = -1;

        for(int item : map.keySet()) {
            if(map.get(item) > maxCount) {
                maxKey = item;
                maxCount = map.get(item);
            }
        }

        return maxKey;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 3 , 4, 4, 4, 4, 4};
        System.out.println(bruteForce(arr));
        System.out.println(better(arr));

        better(arr);
    }
}