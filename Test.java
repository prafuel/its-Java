import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String args[]) {
        // [2,7,11,15], target = 9

        int[] arr = {2,7,11,15};
        int n = arr.length;

        int target = 9;

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++) {
            map.put(arr[i],i);
        }

        int i = 0;
        for(int item : map.keySet()) {
            int diff = target - item;
            if(map.containsKey(diff) && map.get(diff) != i) {
                System.out.println(i + " " + map.get(diff));
                break;
            }
            i++;
        }
    }
}