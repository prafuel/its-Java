import java.util.Map;
import java.util.HashMap;

public class TestSum {
    public static void main(String args[]) {
        int[] arr = {3,0,2};
        int n = arr.length;
        int target = 3;

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < n; i++) {
            map.put(arr[i],i);
        }   


        for(int i = 0; i < n; i++) {
            int sub = target - arr[i];
            if(map.containsKey(sub) && map.get(sub) != i) {
                System.out.println("index are " + i + " " + map.get(sub));
                break;
            }
        }
    }
}
